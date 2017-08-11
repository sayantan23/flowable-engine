/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.cmmn.converter;

/**
 * @author Joram Barrez
 */
public interface CmmnXmlConstants {
    
    String FLOWABLE_EXTENSIONS_NAMESPACE = "http://flowable.org/cmmn";
    
    String ATTRIBUTE_TARGET_NAMESPACE = "targetNamespace";
    String ATTRIBUTE_EXPRESSION_LANGUAGE = "expressionLanguage";
    String ATTRIBUTE_EXPORTER = "exporter";
    String ATTRIBUTE_EXPORTER_VERSION = "exporterVersion";
    String ATTRIBUTE_AUTHOR = "author";
    String ATTRIBUTE_CREATION_DATE = "creationDate";

    String ELEMENT_DEFINITIONS = "definitions";
    String ELEMENT_DOCUMENTATION = "documentation";
    String ELEMENT_CASE = "case";
    String ELEMENT_PLAN_MODEL = "casePlanModel";
    String ELEMENT_STAGE = "stage";    
    String ELEMENT_MILESTONE = "milestone";
    String ELEMENT_TASK = "task";
    String ELEMENT_PLAN_ITEM = "planItem";
    String ELEMENT_SENTRY = "sentry";
    String ELEMENT_PLAN_ITEM_ON_PART = "planItemOnPart";
    String ELEMENT_STANDARD_EVENT = "standardEvent";
    String ELEMENT_ENTRY_CRITERION = "entryCriterion";
    String ELEMENT_EXIT_CRITERION = "exitCriterion";
    
    String ATTRIBUTE_ID = "id";
    String ATTRIBUTE_NAME = "name";
    String ATTRIBUTE_TEXT_FORMAT = "textFormat";
    String ATTRIBUTE_DEFINITION_REF = "definitionRef";
    String ATTRIBUTE_SOURCE_REF = "sourceRef";
    String ATTRIBUTE_SENTRY_REF = "sentryRef";
    String ATTRIBUTE_IS_BLOCKING = "isBlocking";
    
}