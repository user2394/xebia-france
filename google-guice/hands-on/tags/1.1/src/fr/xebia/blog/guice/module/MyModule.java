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
package fr.xebia.blog.guice.module;

import fr.xebia.blog.guice.dao.MyBasicDao;
import fr.xebia.blog.guice.dao.impl.MyBasicDaoImpl;
import fr.xebia.blog.guice.service.MyService;
import fr.xebia.blog.guice.service.impl.MyServiceImpl;

/**
 * Google Guice Module, to bind dependencies to their implementations.
 * 
 * @author <a href="mailto:pabs.agro@gmail.com">Pablo Lopez</a>
 */
public class MyModule implements com.google.inject.Module {

	/**
	 * {@inheritDoc} 
	 */
	@Override
	public void configure(com.google.inject.Binder binder) {

		// Bind to class.
		binder.bind(MyBasicDao.class).to(MyBasicDaoImpl.class);
		binder.bind(MyService.class).to(MyServiceImpl.class);

		// Bind to instance.
		binder.bind(Appendable.class).toInstance(System.out);
	}

}
