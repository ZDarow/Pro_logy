import 'package:flutter/material.dart';
import '../bloc/app_bloc.dart';
import '../screens/radio_screen.dart';
import '../screens/player_screen.dart';
import '../screens/usb_screen.dart';
import '../screens/sd_screen.dart';
import '../screens/disc_screen.dart';
import '../screens/aux_screen.dart';
import '../screens/sxm_screen.dart';
import '../screens/av_in_screen.dart';
import '../screens/bt_scan_screen.dart';

/// Тип для фабрики экрана — создаёт новый экземпляр StatefulWidget
/// при каждой навигации, гарантируя вызов initState()/dispose().
typedef ScreenBuilder = Widget Function(BuildContext);

/// Элемент источника сигнала (Radio, USB, AUX, BT Music и т.д.)
class SourceItem {
  final String name;
  final IconData icon;
  final Color? iconColor;

  /// Фабрика экрана. Если null — экран не предусмотрен (только команда).
  final ScreenBuilder? screenBuilder;

  /// Текстовая команда для отправки на устройство.
  final String command;
  final AppSource appSource;

  const SourceItem({
    required this.name,
    required this.icon,
    this.iconColor,
    this.screenBuilder,
    required this.command,
    required this.appSource,
  });
}

/// Список источников сигнала.
///
/// ВАЖНО: Экраны создаются через screenBuilder (фабрику), а не как const-экземпляры.
/// Это гарантирует, что StatefulWidget.initState() вызывается при каждой навигации.
final List<SourceItem> sources = _buildSources();

List<SourceItem> _buildSources() => [
      SourceItem(
        name: 'Radio',
        icon: Icons.radio,
        iconColor: Colors.orange,
        command: 'RADIO',
        appSource: AppSource.radio,
        screenBuilder: (ctx) => const RadioScreen(),
      ),
      SourceItem(
        name: 'BT Music',
        icon: Icons.bluetooth,
        iconColor: Colors.blue,
        command: 'BT',
        appSource: AppSource.btMusic,
        screenBuilder: (ctx) => const PlayerScreen(),
      ),
      SourceItem(
        name: 'USB',
        icon: Icons.usb,
        iconColor: Colors.teal,
        command: 'USB',
        appSource: AppSource.usb,
        screenBuilder: (ctx) => const UsbScreen(),
      ),
      SourceItem(
        name: 'SD Card',
        icon: Icons.sd_card,
        iconColor: Colors.green,
        command: 'SD',
        appSource: AppSource.sdCard,
        screenBuilder: (ctx) => const SdCardScreen(),
      ),
      SourceItem(
        name: 'Disc',
        icon: Icons.album,
        iconColor: Colors.purple,
        command: 'DISC',
        appSource: AppSource.disc,
        screenBuilder: (ctx) => const DiscScreen(),
      ),
      SourceItem(
        name: 'AUX',
        icon: Icons.headphones,
        iconColor: Colors.grey,
        command: 'AUX',
        appSource: AppSource.aux,
        screenBuilder: (ctx) => const AuxScreen(),
      ),
      SourceItem(
        name: 'GPS',
        icon: Icons.location_on,
        iconColor: Colors.red,
        command: 'GPS',
        appSource: AppSource.gps,
        screenBuilder: null,
      ),
      SourceItem(
        name: 'SXM',
        icon: Icons.satellite_alt,
        iconColor: Colors.indigo,
        command: 'SXM',
        appSource: AppSource.sxm,
        screenBuilder: (ctx) => const SxmScreen(),
      ),
      SourceItem(
        name: 'AV IN',
        icon: Icons.cable,
        iconColor: Colors.brown,
        command: 'AVIN',
        appSource: AppSource.avIn,
        screenBuilder: (ctx) => const AvInScreen(),
      ),
      SourceItem(
        name: 'BT Scan',
        icon: Icons.bluetooth_searching,
        iconColor: Colors.blue,
        command: '',
        appSource: AppSource.btMusic,
        screenBuilder: (ctx) => const BtScanScreen(),
      ),
    ];
