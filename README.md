<p align="center"><img width=50% src="https://raw.githubusercontent.com/DataCloud-project/toolbox/master/docs/img/datacloud_logo.png"></p>&nbsp;

[![GitHub Issues](https://img.shields.io/github/issues/DataCloud-project/DEF-PIPE-DSL.svg)](https://github.com/DataCloud-project/wf-dsl/issues)
[![License](https://img.shields.io/badge/license-Apache2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

# DSL for Big Data Pipelines

Domain-Specific Language (DSL) for defining Big Data Pipeplines. The developed DSL supports 

* a separation of concerns between design and run-time issues;
* reuse of previously developed steps and pipelines in designing new pipelines;
* a flexible and smooth data transfer between steps; and
* applying containerization for nodes and pipeline descriptions.

DEF-PIPE provides tooling that allows you to define Big Data Pipelines according to the DSL.

## Requirements

The DSL is developed using **Eclipse Modeling Framework (EMF) 2.28**. Other versions are not guaranteed to work correctly.
The EMF project is a modeling framework and code generation facility for building tools and other applications based on a structured data model.
In this project the core metamodel is technically represented as an ECore model, which is organised into several smaller packages. each of these packages reflects a specific aspect of our DSL.

### To install EMF 

Follow this link:

* https://download.eclipse.org/modeling/emf/emf/builds/index.html

## Model Serialization (GRAMMAR)

The grammar of the DSL is located at https://github.com/DataCloud-project/DEF-PIPE-DSL/blob/master/Grammar/DSL-Grammar.txt
