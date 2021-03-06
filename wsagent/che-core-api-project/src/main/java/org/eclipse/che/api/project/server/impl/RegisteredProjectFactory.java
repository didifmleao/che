/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.project.server.impl;

import com.google.inject.assistedinject.Assisted;
import org.eclipse.che.api.core.model.workspace.config.ProjectConfig;

public interface RegisteredProjectFactory {

  RegisteredProjectImpl create(
      @Assisted("folder") String folder,
      @Assisted("config") ProjectConfig config,
      @Assisted("updated") boolean updated,
      @Assisted("detected") boolean detected);
}
