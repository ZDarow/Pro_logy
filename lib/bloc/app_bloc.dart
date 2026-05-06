import 'package:equatable/equatable.dart';
import 'package:flutter_bloc/flutter_bloc.dart';

enum AppSource {
  radio,
  btMusic,
  usb,
  sdCard,
  disc,
  aux,
  gps,
  sxm,
  avIn,
}

extension AppSourceExtension on AppSource {
  String get name {
    switch (this) {
      case AppSource.radio:
        return 'Radio';
      case AppSource.btMusic:
        return 'BT Music';
      case AppSource.usb:
        return 'USB';
      case AppSource.sdCard:
        return 'SD Card';
      case AppSource.disc:
        return 'Disc';
      case AppSource.aux:
        return 'AUX';
      case AppSource.gps:
        return 'GPS';
      case AppSource.sxm:
        return 'SXM';
      case AppSource.avIn:
        return 'AV IN';
    }
  }
}

abstract class AppEvent extends Equatable {
  const AppEvent();
  @override
  List<Object?> get props => [];
}

class SelectSource extends AppEvent {
  final AppSource source;
  const SelectSource(this.source);
  @override
  List<Object?> get props => [source];
}

class ClearSource extends AppEvent {
  const ClearSource();
}

class AppState extends Equatable {
  final AppSource? currentSource;
  final bool isLoading;
  final String? error;

  const AppState({
    this.currentSource,
    this.isLoading = false,
    this.error,
  });

  AppState copyWith({
    AppSource? currentSource,
    bool? isLoading,
    String? error,
    bool clearSource = false,
  }) {
    return AppState(
      currentSource: clearSource ? null : (currentSource ?? this.currentSource),
      isLoading: isLoading ?? this.isLoading,
      error: error,
    );
  }

  @override
  List<Object?> get props => [currentSource, isLoading, error];
}

class AppBloc extends Bloc<AppEvent, AppState> {
  AppBloc() : super(const AppState()) {
    on<SelectSource>(_onSelectSource);
    on<ClearSource>(_onClearSource);
  }

  void _onSelectSource(SelectSource event, Emitter<AppState> emit) {
    emit(state.copyWith(currentSource: event.source, isLoading: false));
  }

  void _onClearSource(ClearSource event, Emitter<AppState> emit) {
    emit(state.copyWith(clearSource: true));
  }
}