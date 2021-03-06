/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package br.com.caelum.vraptor.scala

import java.lang.reflect.AccessibleObject
import br.com.caelum.vraptor.ioc.{ApplicationScoped, Component}
import scala.collection.JavaConversions._
import br.com.caelum.vraptor.http.ParanamerNameProvider

/**
 * removes scala meta information from parameter names
 * @author Lucas Cavalcanti
 */
@Component
@ApplicationScoped
class ScalaParameterNameProvider extends ParanamerNameProvider {
  override def parameterNamesFor(accessible:AccessibleObject):Array[String] = {
    super.parameterNamesFor(accessible).map(_.replaceAll("\\$.*$", ""))
  }
}