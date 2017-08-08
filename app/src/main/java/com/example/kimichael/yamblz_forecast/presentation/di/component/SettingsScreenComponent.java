package com.example.kimichael.yamblz_forecast.presentation.di.component;

import com.example.kimichael.yamblz_forecast.presentation.di.module.SettingsScreenModule;
import com.example.kimichael.yamblz_forecast.presentation.di.scope.SettingsScreenScope;
import com.example.kimichael.yamblz_forecast.presentation.view.main.phone.PhoneWeatherFragment;
import com.example.kimichael.yamblz_forecast.presentation.view.settings.SettingsFragment;
import com.example.kimichael.yamblz_forecast.presentation.view.settings.SureDialog;
import com.example.kimichael.yamblz_forecast.presentation.view.settings.dialogs.select.IntervalsDialogFragment;
import com.example.kimichael.yamblz_forecast.presentation.view.places.SuggestsFragment;
import com.example.kimichael.yamblz_forecast.presentation.view.settings.dialogs.select.UnitsDialogFragment;

import dagger.Subcomponent;

/**
 * Created on 22.07.2017.
 */
@SettingsScreenScope
@Subcomponent(modules = {SettingsScreenModule.class})
public interface SettingsScreenComponent {

    void inject(SettingsFragment settingsFragment);
    void inject(IntervalsDialogFragment selectorFragment);
    void inject(UnitsDialogFragment selectorFragment);
    void inject(SuggestsFragment selectorFragment);
    void inject(SureDialog dialog);
    void inject(PhoneWeatherFragment mainForecastFragment);
}
