/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.github.sleroy.fakesmtp.core.exception;

/**
 * Thrown if the SMTP port is invalid while trying to start the server.
 * <p>
 * SMTP port can be invalid if it contains some characters, other than numbers.
 * </p>
 *
 * @author Nilhcem
 * @since 1.0
 */
public final class InvalidPortException extends Exception {
    private static final long serialVersionUID = -3964366344520192790L;

    public InvalidPortException(final Exception e) {
	setStackTrace(e.getStackTrace());
    }
}
