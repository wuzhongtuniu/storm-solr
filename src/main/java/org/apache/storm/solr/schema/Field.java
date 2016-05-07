/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.storm.solr.schema;

import java.io.Serializable;

public class Field implements Serializable {
    private String name;
    private String type;
    private String indexed;
    private String multiValued;
    private String stored;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getIndexed() {
        return indexed;
    }

    public String getMultiValued() {
        return multiValued;
    }

    public String getStored() {
        return stored;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
    }

    public void setMultiValued(String multiValued) {
        this.multiValued = multiValued;
    }

    public void setStored(String stored) {
        this.stored = stored;
    }

    @Override
    public String toString() {
        return "Field{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", indexed='" + indexed + '\'' +
                ", multiValued='" + multiValued + '\'' +
                ", stored='" + stored + '\'' +
                '}';
    }
}
