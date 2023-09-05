/* 自定义trim */
function trim (str) {  //删除左右两端的空格,自定义的trim()方法
  return str == undefined ? "" : str.replace(/(^\s*)|(\s*$)/g, "")
}

//获取url地址上面的参数
function requestUrlParam(argname){
  //  location.href 返回完整的URL（当前页)：
  var url = location.href
  // substring  取字符串中介于两个指定下标之间的字符
  //  indexOf 查找数组中的 "?" 元素： 返回其逻辑地址
  // split 把一个字符串分割成字符串数组:
  var arrStr = url.substring(url.indexOf("?")+1).split("&")
  for(var i =0;i<arrStr.length;i++)
  {
      var loc = arrStr[i].indexOf(argname+"=")
      if(loc!=-1){
          //replace 执行一次替换 把后面的替换前面的
          return arrStr[i].replace(argname+"=","").replace("?","")
      }
  }
  return ""
}
