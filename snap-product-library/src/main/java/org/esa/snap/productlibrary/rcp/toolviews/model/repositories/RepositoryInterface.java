/*
 * Copyright (C) 2017 by Array Systems Computing Inc. http://www.array.ca
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see http://www.gnu.org/licenses/
 */
package org.esa.snap.productlibrary.rcp.toolviews.model.repositories;

import org.esa.snap.engine_utilities.db.ProductQueryInterface;

import javax.swing.*;

/**
 * Created by luis on 24/02/2017.
 */
public interface RepositoryInterface {

    String getName();

    ImageIcon getIconImage();

    ProductQueryInterface getProductQueryInterface();

    default void resetCredentials() {

    }
}
