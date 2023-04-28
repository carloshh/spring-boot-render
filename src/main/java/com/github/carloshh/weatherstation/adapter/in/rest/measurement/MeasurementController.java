package com.github.carloshh.weatherstation.adapter.in.rest.measurement;

import jakarta.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeasurementController {
    private static final Logger LOG = LoggerFactory.getLogger(MeasurementController.class);


    @PostMapping("/measurements")
    void measurements(@Validated @RequestBody MeasurementRequestBody measurementRequestBody) {
        LOG.info("Measurement received: {}", measurementRequestBody);
    }

}
