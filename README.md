# RPC Model - Caller / Client

This is the piece of software that needs to dispatch work to remote workers.

Created RPC Caller / Client based on RabbitMQ's Tutorial Six

[Link to Tutorial Six](https://www.rabbitmq.com/tutorials/tutorial-six-spring-amqp.html)

In this example all work is created by a scheduled task, every second, then sent to calculation on the remote worker.
