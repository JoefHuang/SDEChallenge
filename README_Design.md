# A Google Analytic like Backend System

Given the requirements, a good candidate solution could be Prometheus + Thanos.

Prometheus is an event monitoring and alerting tool. It captures real-time metrics in a time series database. It supports a query language PromQL. Prometheus instances can be configured in High Availability pairs.

However Prometheus only supports a short period of data retention (i.e. up to 15 days). To support the ability to reprocess historical data longer than 15 days, one option is to use Thanos. 

Thanos is a set of components that can be composed into a highly available metric system with unlimited storage capacity, which can be added seamlessly on top of existing Prometheus deployments. 

Below are a couple of deployment options:

Deployment with Sidecar:
![Deployment with Sidecar](https://camo.githubusercontent.com/4720f0b558ad470b8b73a6e459bac133bef772c92f96e4f327ae303e21254fbd/68747470733a2f2f646f63732e676f6f676c652e636f6d2f64726177696e67732f642f652f32504143582d31765442464b4b6766385944496e4a7952616b504538655a5a67397068546c4f734242326f674e6b4676684e47625a385944767a5f63474d6278575a42473147366870735166535831343546705963762f7075623f773d39363026683d373230)

Deployment with Receive:
![Deployment with Receive](https://camo.githubusercontent.com/b0a661d7478b5f65500f704419796ff3ccb3c4aa5ea791c3db2cd2d587831867/68747470733a2f2f646f63732e676f6f676c652e636f6d2f64726177696e67732f642f652f32504143582d317654666b6f323759425f336162375a4c384f444e47357543637270714b78686d71617a336c572d7968474e335f6f4e786b547271586d77776c635a6a61576633634767414a494d34434d77776b45562f7075623f773d39363026683d373230)


