/*
 * Copyright 2002-2008 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.xebia.demo.jmx.webservice;

import javax.xml.ws.WebFault;

/**
 * @author <a href="mailto:cyrille.leclerc@pobox.com">Cyrille Le Clerc</a>
 */
@WebFault
public class HelloWorldServiceException extends Exception {
    
    private static final long serialVersionUID = 1L;
    
    public HelloWorldServiceException() {
        super();
    }
    
    public HelloWorldServiceException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public HelloWorldServiceException(String message) {
        super(message);
    }
    
    public HelloWorldServiceException(Throwable cause) {
        super(cause);
    }
    
}
