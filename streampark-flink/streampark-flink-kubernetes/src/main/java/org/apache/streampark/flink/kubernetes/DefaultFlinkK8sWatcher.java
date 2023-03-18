/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.streampark.flink.kubernetes;

import org.apache.streampark.flink.kubernetes.TrackConfig.FlinkTrackConfig;

public class DefaultFlinkK8sWatcher extends FlinkK8sWatcher {
  private FlinkTrackConfig conf = FlinkTrackConfig.defaultConf();

  private final FlinkK8sWatchController flinkK8sWatchController =
      FlinkK8sWatchController.getInstance();

  private final ChangeEventBus eventBus = new ChangeEventBus();

  public DefaultFlinkK8sWatcher(FlinkTrackConfig conf) {
    this.conf = conf;
  }

  public FlinkTrackConfig getConf() {
    return conf;
  }

  public void setConf(FlinkTrackConfig conf) {
    this.conf = conf;
  }
}
