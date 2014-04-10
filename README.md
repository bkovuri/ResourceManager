ResourceManager
===============

  This is basic template for Resource Manager. Currently it supports following cases
  
    1) Picking cache strategy is flexible. Implementation is done for interfaces, and cache stragies can be implemented as needed.
    2) Creating Producers/Consumers is configurable. We could have as many producers/consumers as per our requirement.
    3) Currently implementation takes Integer as an object. 
    4) We have not added any synchronization keywords as cache strategy BlockingQueue would internally handle it. 
      This ensure code is clean, readable, and scalable
    
    
  Things to be implemented
  
  1) Implementing properties file/XML file and reading those values to Bean classes to decide 
     on which cache startegy to use, how many producers/consumers are needed.
  2) Scaling it to other requirements as needed in the system.
    
