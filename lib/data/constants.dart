import 'package:flutter/material.dart';
import '../screens/radio_screen.dart';
import '../screens/player_screen.dart';
import '../screens/usb_screen.dart';
import '../screens/sd_screen.dart';
import '../screens/disc_screen.dart';
import '../screens/aux_screen.dart';
import '../screens/sxm_screen.dart';
import '../screens/av_in_screen.dart';
import '../screens/bt_scan_screen.dart';
import '../screens/settings_screen.dart';
import '../bloc/app_bloc.dart';

class SourceItem {
  final String name;
  final IconData icon;
  final Color? iconColor;
  final Widget? screen;
  final String command;
  final AppSource appSource;

  const SourceItem({
    required this.name,
    required this.icon,
    this.iconColor,
    required this.screen,
    required this.command,
    required this.appSource,
  });
}

final sources = <SourceItem>[
  SourceItem(
    name: 'Radio',
    icon: Icons.radio,
    iconColor: Colors.orange,
    screen: RadioScreen(),
    command: 'RADIO',
    appSource: AppSource.radio,
  ),
  SourceItem(
    name: 'BT Music',
    icon: Icons.bluetooth,
    iconColor: Colors.blue,
    screen: PlayerScreen(),
    command: 'BT',
    appSource: AppSource.btMusic,
  ),
  SourceItem(
    name: 'USB',
    icon: Icons.usb,
    iconColor: Colors.teal,
    screen: UsbScreen(),
    command: 'USB',
    appSource: AppSource.usb,
  ),
  SourceItem(
    name: 'SD Card',
    icon: Icons.sd_card,
    iconColor: Colors.green,
    screen: SdCardScreen(),
    command: 'SD',
    appSource: AppSource.sdCard,
  ),
  SourceItem(
    name: 'Disc',
    icon: Icons.album,
    iconColor: Colors.purple,
    screen: DiscScreen(),
    command: 'DISC',
    appSource: AppSource.disc,
  ),
  SourceItem(
    name: 'AUX',
    icon: Icons.headphones,
    iconColor: Colors.grey,
    screen: AuxScreen(),
    command: 'AUX',
    appSource: AppSource.aux,
  ),
  SourceItem(
    name: 'GPS',
    icon: Icons.location_on,
    iconColor: Colors.red,
    screen: null,
    command: 'GPS',
    appSource: AppSource.gps,
  ),
  SourceItem(
    name: 'SXM',
    icon: Icons.satellite_alt,
    iconColor: Colors.indigo,
    screen: SxmScreen(),
    command: 'SXM',
    appSource: AppSource.sxm,
  ),
  SourceItem(
    name: 'AV IN',
    icon: Icons.cable,
    iconColor: Colors.brown,
    screen: const AvInScreen(),
    command: 'AVIN',
    appSource: AppSource.avIn,
  ),
  SourceItem(
    name: 'BT Scan',
    icon: Icons.bluetooth_searching,
    iconColor: Colors.blue,
    screen: BtScanScreen(),
    command: '',
    appSource: AppSource.btMusic,
  ),
];

final settingsScreen = SettingsScreen();