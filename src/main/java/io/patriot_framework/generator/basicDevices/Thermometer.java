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

package io.patriot_framework.generator.basicDevices;

import io.patriot_framework.generator.converter.DataConverter;
import io.patriot_framework.generator.converter.DoubleConverter;
import io.patriot_framework.generator.dataFeed.DataFeed;
import io.patriot_framework.generator.device.passive.AbstractSingleSensor;

/**
 * Class should be used when creating Thermometer sensor. Generic types of DataFeed and Sensor itself are the same.
 *
 * @param <E> type of DataFeed and Sensor
 */
public class Thermometer extends AbstractSingleSensor {

//    private DataConverter<E,E> dc = new DoubleConverter<>();

    public Thermometer(String label) {
        super(label);
//        setDataConverter(dc);
    }

    public Thermometer(String label, DataFeed dataFeed) {
        super(label, dataFeed);
//        setDataConverter(dc);
    }

}
