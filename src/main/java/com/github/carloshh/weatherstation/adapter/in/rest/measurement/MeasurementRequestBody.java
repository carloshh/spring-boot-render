package com.github.carloshh.weatherstation.adapter.in.rest.measurement;

import jakarta.validation.constraints.NotNull;

record MeasurementRequestBody(

        @NotNull
        Double temperature,
        @NotNull
        Double relativeHumidity,
        @NotNull
        Double windSpeed
) {
}
