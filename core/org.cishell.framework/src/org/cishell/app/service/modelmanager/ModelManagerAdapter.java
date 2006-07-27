/* **************************************************************************** 
 * CIShell: Cyberinfrastructure Shell, An Algorithm Integration Framework.
 * 
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Apache License v2.0 which accompanies
 * this distribution, and is available at:
 * http://www.apache.org/licenses/LICENSE-2.0.html
 * 
 * Created on Jun 22, 2006 at Indiana University.
 * 
 * Contributors:
 *     Indiana University - 
 * ***************************************************************************/
package org.cishell.app.service.modelmanager;

import org.cishell.framework.datamodel.DataModel;

/**
 * An abstract adapter class for notification of changes in the 
 * {@link ModelManagerService}. The methods in this class are empty. This class
 * exists as a convenience for creating listener objects.
 * 
 * @author Bruce Herr (bh2@bh2.net)
 */
public class ModelManagerAdapter implements ModelManagerListener {
    /**
     * @see org.cishell.app.service.modelmanager.ModelManagerListener#modelAdded(org.cishell.framework.datamodel.DataModel, java.lang.String)
     */
    public void modelAdded(DataModel dm, String label) {}
    
    /**
     * @see org.cishell.app.service.modelmanager.ModelManagerListener#modelRemoved(org.cishell.framework.datamodel.DataModel)
     */
    public void modelRemoved(DataModel dm) {}

    /**
     * @see org.cishell.app.service.modelmanager.ModelManagerListener#modelsSelected(org.cishell.framework.datamodel.DataModel[])
     */
    public void modelsSelected(DataModel[] dm) {}

    /**
     * @see org.cishell.app.service.modelmanager.ModelManagerListener#modelLabelChanged(org.cishell.framework.datamodel.DataModel, java.lang.String)
     */
    public void modelLabelChanged(DataModel dm, String label) {}
}