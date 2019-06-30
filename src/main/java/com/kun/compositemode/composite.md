模式常一起使用，组合在一起设计解决方案中

复合模式在一个解决方案中结合两个或多个模式

能解决一般性或一系列的问题

某些模式结合使用，并不就是复合模式

MVC里的模式：

    Model：是程序主体，代表了业务数据和业务逻辑
    
    View：是与用户交互的界面，显示数据、接受输入，但不参与实际业务逻辑
    
    Controller：接受用户输入，并解析反馈给Model
    
    Model与View和Controller是观察者模式
    
    View以组合模式管理控件
    
    View与Controller是策略模式关系，Controller提供策略
