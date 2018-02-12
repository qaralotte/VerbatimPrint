# VerbatimPrint
译名:逐字打印<br>
作用:类似于RPG人物对话的效果<br>
类型:jar<br>
# 如何使用
`//首先实例化对象`<br>
`VerbatimPrint 逐字打印 = new VerbatimPrint(文本内容,打印间隔时间);`<br>
`//重载接口`<br>
`逐字打印.setOnVerbatimPrintRunListener(new OnVerbatimPrintRunListener(){`<br>
`        @override`<br>
`        public void onRunning(String text)`<br>
`        {`<br>
`                  //这里你可以将内容打印到任何地方，比如TextView的setText(内容)`<br>
`        }`<br>
`});`<br>
