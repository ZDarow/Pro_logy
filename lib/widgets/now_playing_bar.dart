import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import '../bloc/app_bloc.dart';

class NowPlayingBar extends StatelessWidget {
  final VoidCallback? onTap;

  const NowPlayingBar({super.key, this.onTap});

  @override
  Widget build(BuildContext context) {
    final appState = context.watch<AppBloc>().state;
    final sourceName = appState.currentSource?.name ?? '';

    if (sourceName.isEmpty) {
      return const SizedBox.shrink();
    }

    return GestureDetector(
      onTap: onTap,
      child: Container(
        height: 64,
        decoration: BoxDecoration(
          color: Theme.of(context).colorScheme.primaryContainer,
          boxShadow: [
            BoxShadow(
              color: Colors.black.withValues(alpha: 0.1),
              blurRadius: 4,
              offset: const Offset(0, -2),
            ),
          ],
        ),
        child: Row(
          children: [
            const SizedBox(width: 16),
            Container(
              width: 48,
              height: 48,
              decoration: BoxDecoration(
                color: Theme.of(context).colorScheme.primary,
                borderRadius: BorderRadius.circular(8),
              ),
              child: const Icon(Icons.play_arrow, color: Colors.white),
            ),
            const SizedBox(width: 16),
            Expanded(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    sourceName,
                    style: const TextStyle(
                      fontWeight: FontWeight.bold,
                      fontSize: 16,
                    ),
                    maxLines: 1,
                    overflow: TextOverflow.ellipsis,
                  ),
                  Text(
                    'Сейчас воспроизводится',
                    style: TextStyle(
                      fontSize: 12,
                      color: Colors.grey.shade600,
                    ),
                  ),
                ],
              ),
            ),
            IconButton(
              icon: const Icon(Icons.pause),
              onPressed: () {},
            ),
            IconButton(
              icon: const Icon(Icons.stop),
              onPressed: () {
                context.read<AppBloc>().add(const ClearSource());
              },
            ),
            const SizedBox(width: 8),
          ],
        ),
      ),
    );
  }
}