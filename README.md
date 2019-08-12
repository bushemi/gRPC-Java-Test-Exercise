Java Test Exercise

Requirements(gRPC server, gRPC client, protobuf, http client, junit 5, completablefuture)

Implement gRPC server that receives object with adress of web resource(example: google.com) in the request and returns the response code of the web resource and the time during which the resource responded. Create tests using at least 20 web resources:
           <p>a) Single threaded blocking call;</p>
          <p> b) Single threaded non blocking call;</p>
          <p> c) Multithreaded blocking call;</p>
          <p> d) Multi-thread non-blocking call;</p>
