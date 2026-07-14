import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../providers/bt_provider.dart';

class PlayerScreen extends StatefulWidget {
  const PlayerScreen({super.key});

  @override
  State<PlayerScreen> createState() => _PlayerScreenState();
}

class _PlayerScreenState extends State<PlayerScreen> {
  bool isPlaying = false;

  @override
  Widget build(BuildContext context) {
    final bt = context.watch<BtProvider>();

    return Scaffold(
      appBar: AppBar(title: const Text('Player')),
      body: Padding(
        padding: const EdgeInsets.all(16),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Icon(Icons.album, size: 120),
            const SizedBox(height: 20),
            const Text('Unknown Track', style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold)),
            const Text('Unknown Artist', style: TextStyle(fontSize: 18, color: Colors.grey)),
            const SizedBox(height: 40),
            Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                IconButton(
                  icon: const Icon(Icons.skip_previous, size: 48),
                  onPressed: bt.isConnected ? () => bt.prevTrack() : null,
                ),
                const SizedBox(width: 20),
                IconButton(
                  icon: Icon(isPlaying ? Icons.pause : Icons.play_arrow, size: 64),
                  onPressed: bt.isConnected
                      ? () {
                          setState(() => isPlaying = !isPlaying);
                          bt.playPause();
                        }
                      : null,
                ),
                const SizedBox(width: 20),
                IconButton(
                  icon: const Icon(Icons.skip_next, size: 48),
                  onPressed: bt.isConnected ? () => bt.nextTrack() : null,
                ),
              ],
            ),
            const SizedBox(height: 40),
            Row(
              children: [
                IconButton(
                  icon: const Icon(Icons.volume_down),
                  onPressed: bt.isConnected ? () => bt.volumeDown() : null,
                ),
                Expanded(
                  child: Slider(
                    value: bt.volume.toDouble(),
                    min: 0,
                    max: 100,
                    onChanged: bt.isConnected
                        ? (v) => bt.volumeSet(v.toInt())
                        : null,
                  ),
                ),
                IconButton(
                  icon: const Icon(Icons.volume_up),
                  onPressed: bt.isConnected ? () => bt.volumeUp() : null,
                ),
              ],
            ),
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 16),
              child: Text('Volume: ${bt.volume}/100'),
            ),
            if (!bt.isConnected)
              const Padding(
                padding: EdgeInsets.only(top: 20),
                child: Text('Подключите Bluetooth для управления', style: TextStyle(color: Colors.grey)),
              ),
          ],
        ),
      ),
    );
  }
}
