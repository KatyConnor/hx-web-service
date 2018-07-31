<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=8">
	<meta name="renderer" content="webkit">
<title>用户登录</title>
<!-- <link rel="stylesheet" href="../../js/base.css"/>
<link rel="stylesheet" href="../../css/bootstrap/css/bootstrap-theme.css"/>
<link rel="stylesheet" href="../../css/bootstrap/css/bootstrap-theme.css.map"/>
<link rel="stylesheet" href="../../css/bootstrap/css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="../../css/bootstrap/css/bootstrap.css"/>
<link rel="stylesheet" href="../../css/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="../../css/bootstrap/css/bootstrap.css.map"/> -->
<script src="https://cdn.jsdelivr.net/npm/vue@2.5.16/dist/vue.js"></script>
<!-- <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js" /> -->
<style>
    [v-cloak] {
        display: none;
    }
</style>
</head>
<body>
	<div id="app" v-cloak>
        {{name}} {{ange}} {{address}}
	</div>

	<div id="app-2">
	  <span v-bind:title="message">
	    鼠标悬停几秒钟查看此处动态绑定的提示信息！
	  </span>
	</div>

    <div id="example-1">
        <button v-on:click="counter += 1">Add 1</button>
        <p>The button above has been clicked {{ counter }} times.</p>
    </div>

    <div id="example-2">
        <!-- `greet` 是在下面定义的方法名 -->
        <button v-on:click="greet">Greet</button>
    </div>

	<script type="text/javascript">
	// 我们的数据对象
	var data = {
	    name: '张三',
		ange: 26,
		address: '重庆'
	}
	var app = new Vue({
	  el: '#app',
	  data: data
	});

	var app2 = new Vue({
	  el: '#app-2',
	  data: {
	    message: '页面加载于 ' + new Date().toLocaleString()
	  }
	});


    var example1 = new Vue({
        el: '#example-1',
        data: {
            counter: 0
        }
    });


    var example2 = new Vue({
        el: '#example-2',
        data: {
            name: 'Vue.js'
        },
        // 在 `methods` 对象中定义方法
        methods: {
            greet: function (event) {
                // `this` 在方法里指向当前 Vue 实例
                alert('Hello ' + this.name + '!')
                // `event` 是原生 DOM 事件
                if (event) {
                    alert(event.target.tagName)
                }
            }
        }
    });

    new Vue({
        el:'#app',
        data:{data:""},
        created:function(){
            var url="json.jsp";
            var _self=this;
            $.get(url,function(data){
                _self.data=eval("(" + data +")");
            })
            /*
            this.$http.get(url).then(function(data){
                var json=data.body;
                this.data=eval("(" + json +")");
            },function(response){
                console.info(response);
            })*/
        }
    });

    // 也可以用 JavaScript 直接调用方法
   // example2.greet(); // => 'Hello Vue.js!'

</script>
</body>
</html>