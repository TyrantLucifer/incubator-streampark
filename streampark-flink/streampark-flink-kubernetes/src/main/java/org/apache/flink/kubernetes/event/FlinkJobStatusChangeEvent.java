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

package org.apache.flink.kubernetes.event;

import org.apache.flink.kubernetes.model.JobStatusCV;
import org.apache.flink.kubernetes.model.TrackId;

/** Notification of flink job state changes from k8s clusters. */
public class FlinkJobStatusChangeEvent implements BuildInEvent {
  private final TrackId trackId;

  private final JobStatusCV jobStatus;

  public FlinkJobStatusChangeEvent(TrackId trackId, JobStatusCV jobStatus) {
    this.trackId = trackId;
    this.jobStatus = jobStatus;
  }

  public TrackId getTrackId() {
    return trackId;
  }

  public JobStatusCV getJobStatus() {
    return jobStatus;
  }
}
