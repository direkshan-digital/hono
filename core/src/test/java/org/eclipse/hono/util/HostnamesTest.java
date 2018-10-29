/*******************************************************************************
 * Copyright (c) 2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/

package org.eclipse.hono.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for {@link Hostnames}.
 */
public class HostnamesTest {

    /**
     * The result must never be {@code null}.
     */
    @Test
    public void testNonNull() {
        Assert.assertNotNull(Hostnames.getHostname());
    }
}