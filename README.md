# securitydemo

This is a standalone client program that exploits a race condition in a toy service I wrote for the SigFig backend platform. The object is to demonstrate in a live presentation how easy it can be to inadvertently introduce easily-exploitable race conditions.

The flow is supposed to be:

1. Call the "adduser" API to register a username and password.
2. Wait for an administrator to manually approve your account.
3. Call the "getsecret" API with your username and password to get the secret.

The vulnerability in this case is that if you call the "adduser" and "getsecret" APIs in rapid succession, it's possible to obtain the secret without adminstrator approval.

This program repeatedly searches a configurable range of delay times to sleep between calling the "adduser" and "getsecret" APIs until it obtains the secret. This can be done surprisingly quickly over the Internet with a very small number of workers:

    21:47:13 [main] INFO  n.b.s.ExploitTaskRunner$ - Starting worker 1...
    21:47:13 [main] INFO  n.b.s.ExploitTaskRunner$ - Starting worker 2...
    21:47:13 [main] INFO  n.b.s.ExploitTaskRunner$ - Starting worker 3...
    21:47:13 [main] INFO  n.b.s.ExploitTaskRunner$ - Starting worker 4...
    21:47:24 [pool-1-thread-3] INFO  n.b.s.ExploitTaskRunner$ - Exploit successful after 28 attempts.
    21:47:24 [pool-1-thread-3] INFO  n.b.s.ExploitTaskRunner$ - 11 seconds and 502 milliseconds elapsed.
    21:47:24 [pool-1-thread-3] INFO  n.b.s.ExploitTaskRunner$ - The secret is 0451.