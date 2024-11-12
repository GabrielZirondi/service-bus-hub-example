
# Azure Service Bus Hub Example

This project provides an example implementation of an Azure Service Bus Hub framework with out-of-the-box support for listeners, error handlers, and dead letter handlers. Using annotations, it simplifies message handling for queues and topics.

In this example the property `example.listener` can be set to either `auto` or `manual` to demonstrate message handling based on the completion mode.

## Key Features

- **Annotation-driven setup**: Easily register queue and topic listeners with `@QueueListener` and `@TopicListener`.
- **Global Error and Dead Letter Handling**: Handle errors and dead-lettered messages with `@GlobalErrorHandler` and `@GlobalDeadLetterHandler`.
- **Queue- and Topic-specific Error Handlers**: Define specific error handling methods with `@ErrorHandler.`

## License
This project is licensed under the Apache License 2.0, allowing you to freely use it for commercial purposes. See the full license text [here](LICENSE).