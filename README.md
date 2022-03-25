<p align="center"><img width=50% src="https://raw.githubusercontent.com/DataCloud-project/toolbox/master/docs/img/datacloud_logo.png"></p>&nbsp;

[![GitHub Issues](https://img.shields.io/github/issues/DataCloud-project/DEF-PIPE-DSL.svg)](https://github.com/DataCloud-project/wf-dsl/issues)
[![License](https://img.shields.io/badge/license-Apache2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# DSL for Big Data pipelines

Domain-Specific Language (DSL) for defining Big Data pipeplines. The developed DSL supports

* a separation of concerns between design and run-time issues;
* reuse of previously developed steps and pipelines in designing new pipelines;
* a flexible and smooth data transfer between steps; and
* applying containerization for nodes and pipeline descriptions.

[DEF-PIPE](https://github.com/DataCloud-project/DEF-PIPE) provides tooling that allows you to define Big Data pipelines according to the DSL.

## Requirements

In order to load the DSL project you will need to install the [Eclipse IDE](https://www.eclipse.org/eclipseide/).

We recommend using release 2021-12 of the [Eclipse Installer](https://www.eclipse.org/downloads/packages/release/2021-12/r). During the installation, select the bundle [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/release/2021-12/r/eclipse-modeling-tools) as this contains the [Eclipse Modeling Framework (EMF)](https://www.eclipse.org/modeling/emf/) package that is used to define DSL.

## EMF Ecore model

The EMF project is a modeling framework and code generation facility for building tools and other applications based on a structured data model. In this project the core metamodel is technically represented as an ECore model, which is organised into several smaller packages. Each of these packages reflects a specific aspect of our DSL. The DSL is developed using [EMF version 2.28](https://download.eclipse.org/modeling/emf/emf/builds/release/2.28/index.html) which comes installed with recommended 2021-12 release of the Eclipse Modeling Tools bundle. Other versions are not guaranteed to work correctly.

Follow these steps to load the EMF project and open the EMF diagrams:

1. Clone the DEF-PIPE-DSL repository from GitHub.

2. Start the Eclipse IDE and select the cloned folder as the workspace.

3. Select "File" -> "Open projects from file system" and import the following projects.

    ![alt text](https://raw.githubusercontent.com/DataCloud-project/DEF-PIPE-DSL/master/docs/eclipse-import-projects.png)

4. Select "Window" -> "Perspective" -> "Open Perspective" -> "Other" and select the "Modeling (default)".

    ![alt text](https://raw.githubusercontent.com/DataCloud-project/DEF-PIPE-DSL/master/docs/eclipse-open-perspective-modeling.png)

5. Navigate to the file "workflow/model/generated/WfDsl.aird" and double click on it. After this you will then be able to navigate to the sub-folder "Representations per category" where you will be able to open the EMF diagrams, i.e., the "wfDsl class diagram" as shown below.

    ![alt text](https://raw.githubusercontent.com/DataCloud-project/DEF-PIPE-DSL/master/docs/eclipse-wfdsl-class-diagram.png)

### Troubleshooting

If you have problems selecting the Model Perspective, you may need to re-initialize the Ecore Diagram. Follow these steps:

1. Navigate to the file "workflow/model/generated/WfDsl.ecore", right click and select "Initialize Ecore Diagram..."

    ![alt text](https://raw.githubusercontent.com/DataCloud-project/DEF-PIPE-DSL/master/docs/eclipse-initialize-ecore-diagram.png)

2. Select the default options suggested by the "Create representation" wizard, i.e., output file named "WfDsl.aird" and "Entities in a Class Diagram".

3. Select the "Modeling (default)" perspective as explained in step 4 above.

## Xtext grammar (model serialization)

The grammar of the DSL is defined according to [Xtext](https://www.eclipse.org/Xtext/) and is located at 

* https://github.com/DataCloud-project/DEF-PIPE-DSL/blob/master/Grammar/DSL-Grammar.txt
