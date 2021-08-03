# RPC Model - Caller / Client

This is the piece of software that needs to dispatch work to remote workers.

Created RPC Caller / Client based on RabbitMQ's Tutorial Six

[Link to Tutorial Six](https://www.rabbitmq.com/tutorials/tutorial-six-spring-amqp.html)

In this example all work is created by a scheduled task, every second, then sent to calculation on the remote worker.

## How to test

* Start docker with
```shell
docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management
```
* Start Called / Server / Worker: the another one 😃
* Start Caller / Client / Manager: this one 😁