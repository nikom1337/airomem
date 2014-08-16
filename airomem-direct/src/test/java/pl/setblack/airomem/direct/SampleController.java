/*
 *  Copyright (c) Jarek Ratajski, Licensed under the Apache License, Version 2.0
 *  http://www.apache.org/licenses/LICENSE-2.0 
 */

package pl.setblack.airomem.direct;

import static org.junit.Assert.assertNotNull;

/**
 * Sample controller for tests.
 * 
 */
@Persistent
public class SampleController {
  
    @PersistentObject
    private SampleObject object;
    
    public void writeMethod() {
        assertNotNull(object);
    }
    
}