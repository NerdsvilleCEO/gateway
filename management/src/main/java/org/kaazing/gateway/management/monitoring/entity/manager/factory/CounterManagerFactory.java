/**
 * Copyright 2007-2016, Kaazing Corporation. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaazing.gateway.management.monitoring.entity.manager.factory;

import org.kaazing.gateway.management.monitoring.entity.manager.ServiceCounterManager;
import org.kaazing.gateway.service.MonitoringEntityFactory;

/**
 * Factory for returning a specific counter manager
 *
 */
public interface CounterManagerFactory {

    /**
     * Method responsible with returning a ServiceSessionCounterManager responsible with
     * holding the service session counter data and performing the needed operations of
     * its respective counters
     * @param monitoringEntityFactory - the monitoring entity factory
     * @param serviceName - the service name parameter
     * @param gatewayId - gateway id
     * @return - the ServiceCounterManager instance
     */
    ServiceCounterManager makeServiceCounterManager(
            MonitoringEntityFactory monitoringEntityFactory,
            String serviceName, String gatewayId);

}
