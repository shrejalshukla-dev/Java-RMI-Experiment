# Java RMI Experiment

## Aim
To implement Remote Method Invocation (RMI) in Java using client-server architecture.

## Introduction
Java RMI (Remote Method Invocation) allows an object running in one Java Virtual Machine to invoke methods of an object running in another Java Virtual Machine.

## Technologies Used
- Java
- JDK
- Visual Studio Code
- Java RMI

## Project Files
- `MyRemote.java` – Defines the remote interface.
- `MyServer.java` – Creates and registers the remote object.
- `MyClient.java` – Looks up the remote object and calls its method.

## How to Run

### 1. Compile the Java files
```bash
javac MyRemote.java MyServer.java MyClient.java
```

### 2. Start the server
```bash
java MyServer
```

Expected server output:
```text
RMI Server is ready.
```

### 3. Start the client
Open a second terminal in the same folder and run:

```bash
java MyClient
```

Expected client output:
```text
Hello from RMI Server!
```

## Working
1. The remote interface declares the method `sayHello()`.
2. The server implements the interface and registers the remote object with the RMI registry.
3. The client looks up the registered object using the name `HelloService`.
4. The client invokes `sayHello()` and receives the message from the server.

## Result
The Java RMI program was executed successfully, and the client received a message from the server.

## Author
Shrejal Shukla
