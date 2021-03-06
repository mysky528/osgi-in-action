/*
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
package org.foo.shape;

import java.awt.Graphics2D;

import java.awt.Point;

import javax.swing.Icon;

/**
 * This interface defines the <tt>SimpleShape</tt> service. This service is used
 * to draw shapes. 
 **/
public interface SimpleShape {
  /**
   * A service property for the name of the shape.
   **/
  public static final String NAME_PROPERTY = "simple.shape.name";
  
  /**
   * Draw this shape at the given position.
   * 
   * @param g2 The graphics object used for painting.
   * @param p The position to paint the shape.
   **/
  public void draw(Graphics2D g2, Point p);
  
  /**
   * Provide the icon that represents this shape
   * @return
   */
  public Icon getIcon();
}
