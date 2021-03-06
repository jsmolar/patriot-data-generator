/*
 * Copyright 2019 Patriot project
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.patriot_framework.generator.device.impl.basicSensors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.patriot_framework.generator.dataFeed.DataFeed;
import io.patriot_framework.generator.device.passive.sensors.AbstractSimpleSensor;

/**
 * Default Device class. This should be used when creating sensor, that is not jet implemented.
 * Otherwise user should use respective Device class.
 */
public class Default extends AbstractSimpleSensor {

    @JsonCreator
    public Default(@JsonProperty("label") String label, @JsonProperty("label") DataFeed dataFeed) {
        super(label, dataFeed);
    }

}
