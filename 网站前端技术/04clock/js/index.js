window.onload=function(){
	var clock=document.getElementById("clock");
	var cxt=clock.getContext("2d");
    function circle(r,color,w){
        cxt.lineWidth=w;        //设置线条宽度
        cxt.strokeStyle=color;  //设置线条颜色
        cxt.beginPath();        //起始一条路径
        cxt.arc(250,250,r,0,360,false);  //绘制曲线,圆心坐标为画布中心（250,250）
        cxt.stroke();           //绘制已定义的路径
	}
    function line(i){
		cxt.save();
		cxt.strokeStyle="#000";
		cxt.translate(250,250);
		cxt.rotate(i*6*Math.PI/180);
		cxt.beginPath();
		if(i%5==0){
			cxt.lineWidth=7;
			cxt.moveTo(0,-170);
		}else{
			cxt.lineWidth=5;
			cxt.moveTo(0,-180);
		}
		cxt.lineTo(0,-190);
		cxt.stroke();
		cxt.restore();
	}
    function needle(color,w,s,t,r){
		cxt.save();
		cxt.strokeStyle=color;
		cxt.lineWidth=w;
		cxt.translate(250,250);
		cxt.rotate(r*Math.PI/180);
		cxt.beginPath();
		cxt.moveTo(0,s);
		cxt.lineTo(0,t);
		cxt.stroke();
		cxt.restore();
	}
    function preSec(r){
		cxt.save();
		cxt.lineWidth=2;
		cxt.strokeStyle="red";
		cxt.translate(250,250);
		cxt.rotate(r*Math.PI/180);
		cxt.beginPath();
		cxt.arc(0,-150,3,0,360,false);
		cxt.fillStyle="#808080";
		cxt.fill();
		cxt.stroke();
		cxt.restore();
	}
    function drawPoint(){
		var now=new Date();
		var h=now.getHours();
		h=h>12?h-12:h;
		var min=now.getMinutes();
		var sec=now.getSeconds();
		needle("#000",10,20,-60,(h*30+min/60*30));
		needle("#808080",6,30,-90,min*6);
		needle("red",2,35,-180,sec*6);
		preSec(sec*6);
	}
    function draw(){
        cxt.clearRect(0,0,500,500);
		circle(200,"blue",7);
        for(var i=0;i<60;i++){
			line(i);
		}
        drawPoint();
        circle(10,"red",2);
        circle(3,"red",3);
	}
    setInterval(function(){
		draw();
	},1000);
}