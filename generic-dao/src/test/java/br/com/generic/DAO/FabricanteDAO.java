/*
 * Copyright 2015 Henrique Luiz da Silva Mota
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package br.com.generic.DAO;

import javax.persistence.EntityManager;

import br.com.generic.dao.GenericDAO;
import br.com.generic.entity.Fabricante;

public interface FabricanteDAO extends GenericDAO<Fabricante> {

	public void setEntityManager(EntityManager entityManager);
}
