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

package io.patriot_framework.generator;

public class Data {

    private Class<?> dataClazz;

    private Object data;

    public Data(Class<?> dataClazz, Object data) {
        this.dataClazz = dataClazz;
        this.data = data;
    }

    public Data(Class<?> dataClazz) {
        this.dataClazz = dataClazz;
    }

    public <T> T get(Class<T> clazz) {
        if(dataClazz.equals(clazz)) {
            return clazz.cast(data);
        }

        return null;
    }

    public <T> T set(T obj, Class<T> clazz) {
        if(dataClazz.equals(clazz)) {
            data = obj;
            return clazz.cast(data);
        }

        return null;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dataClazz=" + dataClazz +
                ", data=" + data.toString() +
                '}';
    }
}
