(this["webpackJsonptracing-ui"]=this["webpackJsonptracing-ui"]||[]).push([[0],{119:function(e,t,a){"use strict";a.r(t);var n=a(0),r=a.n(n),l=a(10),i=a.n(l),c=(a(93),a(78)),o=a(153),s=a(120),m=a(166),u=a(163),h=a(20),d=a(11),b=a(52),E=a(70),p=a.n(E).a.create({baseURL:"".concat("http://localhost:8080"),validateStatus:function(){return!0}}),f=a(71),g=a.n(f)()(),y=Object(b.a)({reducers:{setShowSpinner:function(e,t){var a=t.payload;e.showSpinner=a.showSpinner},setNumArray:function(e,t){var a=t.payload;e.numArray=a.numArray},setActionList:function(e,t){var a=t.payload;e.actionList=a.actionList},setNumNums:function(e,t){var a=t.payload;e.numNums=a},setNumLists:function(e,t){var a=t.payload;e.numLists=a},setRand2dArray:function(e,t){var a=t.payload;e.rand2dArray=a},setUserCode:function(e,t){var a=t.payload;e.userCode=a},setUserCodeErr:function(e,t){var a=t.payload;e.userCodeErr=a},setSearchValForm:function(e,t){var a=t.payload;e.searchVal=a},setSearchVal:function(e,t){var a=t.payload;e.searchVal=a.searchVal},setSearchIndex:function(e,t){var a=t.payload;e.searchIndex=a.searchIndex},setAlgorithm:function(e,t){var a=t.payload;e.algorithm=a},setStatus:function(e,t){var a=t.payload;e.status=a}},initialState:{showSpinner:!1,numArray:[],rand2dArray:[Array(1)],actionList:[],numNums:10,numLists:1,userCode:"",userCodeErr:"",searchVal:-1,searchIndex:-1,algorithm:"",status:!1},name:"ui"}),v=function(){return function(e,t){var a=t();e(y.actions.setShowSpinner({showSpinner:!0})),p.post("/random",{numString:"".concat(a.ui.numNums),numLists:parseInt(a.ui.numLists)}).then((function(t){200===t.status?(e(y.actions.setRand2dArray(t.data)),e(y.actions.setShowSpinner({showSpinner:!1}))):(e(y.actions.setNumArray("Bad")),e(y.actions.setShowSpinner({showSpinner:!1})))}))}},x=function(e,t){return function(a,n){var r=n();a(y.actions.setShowSpinner({showSpinner:!0})),p.post("/".concat(e),{numString:"".concat(r.ui.numNums),sort:"".concat(t)}).then((function(e){200===e.status?(a(y.actions.setNumArray({numArray:e.data.randArray})),a(y.actions.setActionList({actionList:e.data.actionList}))):(a(y.actions.setNumArray("Bad")),a(y.actions.setShowSpinner({showSpinner:!1})))}))}},S=function(e,t,a){return console.log("asdasdasd",e,t,a),function(n,r){var l=r();n(y.actions.setShowSpinner({showSpinner:!0})),p.post("/".concat(e),{numString:"".concat(l.ui.numNums),search:"".concat(t),searchVal:a}).then((function(e){console.log("response",e),200===e.status?(n(y.actions.setNumArray({numArray:e.data.recordableArray.randArray})),n(y.actions.setActionList({actionList:e.data.recordableArray.actionList})),n(y.actions.setSearchIndex({searchIndex:e.data.searchIndex}))):(n(y.actions.setNumArray("Bad")),n(y.actions.setShowSpinner({showSpinner:!1})))}))}},j=function(){return function(e,t){var a=t();e(y.actions.setShowSpinner({showSpinner:!0})),p.post("/custom-code",{userCode:a.ui.userCode,algorithm:a.ui.algorithm}).then((function(t){200===t.status?(console.log(t.data.error),void 0!==t.data.error?e(y.actions.setUserCodeErr({err:t.data.error})):(console.log("data",t.data),e(y.actions.setNumArray({numArray:t.data.arr.randArray})),e(y.actions.setActionList({actionList:t.data.arr.actionList})),e(y.actions.setSearchVal({searchVal:parseInt(t.data.searchVal)})),e(y.actions.setStatus({status:!0})))):(e(y.actions.setNumArray("Bad")),e(y.actions.setShowSpinner({showSpinner:!1})))})),console.log(a.ui.numArray)}},w=y,N=a(151),O=a(154),A=a(155),C=a(156),L=a(157),k=a(158),T=a(159),I=a(4),B=a(152),z=Object(I.a)((function(e){return{head:{background:"#197bff",color:e.palette.common.white}}}))(N.a),V=Object(B.a)((function(e){return{container:{width:"95%"},row:{background:"#f0f0f0"},header:{background:"#197bff"}}}));function H(e){var t=e.randNum2dArray,a=V();return 1===t[0].length?null:r.a.createElement(o.a,{container:!0,justify:"center"},r.a.createElement(O.a,{component:A.a,className:a.container},r.a.createElement(C.a,{className:a.table},r.a.createElement(L.a,null,r.a.createElement(k.a,{className:a.header},r.a.createElement(z,null,r.a.createElement(s.a,{variant:"overline"},"Random Number List(s)")),t[0].map((function(){return r.a.createElement(z,null)})))),r.a.createElement(T.a,null,t.map((function(e,t){return r.a.createElement(k.a,{key:t,className:a.row},r.a.createElement(N.a,null,t+1),e.map((function(e,t){return r.a.createElement(N.a,{align:"center",key:t},e)})))}))))))}var P=Object(B.a)((function(e){return{root:{marginLeft:"10px",marginTop:"5px"},header:{fontSize:30,marginLeft:"10px",marginTop:"5px"},subHeader:{fontSize:15,marginLeft:"10px",marginTop:"0px",marginBottom:"10px"},visualizerHelper:{fontSize:13,marginTop:"10px",marginLeft:"10px"},gridSpacing:{marginTop:"5px",marginBottom:"5px"}}}));var R=Object(h.b)((function(e){return{rand2dArray:e.ui.rand2dArray,numNums:e.ui.numNums}}),(function(e){return Object(d.b)({getRandData:v,setNumNums:w.actions.setNumNums,setNumLists:w.actions.setNumLists},e)}))((function(e){var t=P();return r.a.createElement(o.a,{container:!0,direction:"column",alignItems:"center",style:{width:"100%",height:"100vh"}},r.a.createElement(o.a,{container:!0,item:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:t.header},"Random Number Generator")),r.a.createElement(o.a,{item:!0,container:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:t.subHeader},"Generate random number lists.")),r.a.createElement(o.a,{item:!0,container:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:t.root},"Use this resource to see how test data is generated for the sort and search tutorial algorithms.")),r.a.createElement(o.a,{item:!0,container:!0,justify:"center",direction:"column"},r.a.createElement(o.a,{container:!0,item:!0,justify:"center",className:t.gridSpacing},r.a.createElement(m.a,{onChange:function(t){e.setNumNums(t.target.value)},variant:"outlined",label:"How many values in a list?",style:{margin:"10px"}})),r.a.createElement(o.a,{container:!0,item:!0,justify:"center",className:t.gridSpacing},r.a.createElement(m.a,{variant:"outlined",onChange:function(t){e.setNumLists(t.target.value)},label:"How many lists?",style:{margin:"10px"}})),r.a.createElement(o.a,{item:!0,container:!0,justify:"center",className:t.gridSpacing},r.a.createElement(u.a,{onClick:function(){return e.getRandData()},variant:"outlined"},"Generate")),r.a.createElement(o.a,{item:!0,container:!0,justify:"center",className:t.gridSpacing},r.a.createElement(H,{randNum2dArray:e.rand2dArray}))))})),D=Object(B.a)((function(e){return{root:{background:"#197bff",width:"100%",padding:"10px"},text:{color:"white",fontSize:30}}}));function U(){var e=D();return r.a.createElement(o.a,{container:!0,direction:"row",className:e.root},r.a.createElement(o.a,{container:!0,item:!0,xs:4}),r.a.createElement(o.a,{container:!0,item:!0,xs:4,justify:"center",alignItems:"center"},r.a.createElement(s.a,{variant:"overline",className:e.text},"Visual Debugger")),r.a.createElement(o.a,{container:!0,item:!0,xs:4,justify:"flex-end"}))}var G=Object(B.a)((function(e){return{root:{width:"100%"}}}));function F(e){var t=e.Component,a=G();return r.a.createElement(o.a,{container:!0,direction:"row",className:a.root},r.a.createElement(o.a,{item:!0,xs:12},r.a.createElement(U,null),t))}var W=a(162),q=a(164),J=a(77),M=(Object(J.a)({palette:{primary:{main:"#e0e0e0"},secondary:{main:"#197bff"}},status:{danger:"orange"}}),Object(B.a)((function(e){return{root:{width:"100%",minWidth:"100px",background:"#e0e0e0",padding:"0px"},button:{background:"#e0e0e0",width:"100%",paddingTop:"15px",paddingBottom:"15px",minWidth:"100px"},selectedBackground:{background:"#cccccc",width:"100%",minWidth:"100px"},font:{fontSize:14}}})));function X(e){var t=e.items,a=Object(c.d)(),n=M(),l=Object(c.e)();return r.a.createElement(W.a,{className:n.root},t.map((function(e,t){return r.a.createElement(q.a,{button:!0,key:t,onClick:function(){return a.push("/".concat(e.path))},style:{background:l.pathname==="/".concat(e.path)?"#cccccc":"#e0e0e0"},className:n.button},r.a.createElement(s.a,{variant:"overline",className:n.font},e.name))})))}var $={binarySearch:{name:"Binary Search",path:"binary-search"},linearSearch:{name:"Linear Search",path:"linear-search"},selectionSort:{name:"Selection Sort",path:"selection-sort"},insertionSort:{name:"Insertion Sort",path:"insertion-sort"},bubbleSort:{name:"Bubble Sort",path:"bubble-sort"},randomGenerator:{name:"Random Generator",path:"random"},userCode:{name:"User Code",path:"user-code"},home:{name:"Home",path:"home"}};function K(e){var t=e.Component;return r.a.createElement(o.a,{container:!0,direction:"row",style:{height:"100vh"}},r.a.createElement(o.a,{container:!0,item:!0,xs:2},r.a.createElement(X,{items:Object.values($)})),r.a.createElement(o.a,{item:!0,container:!0,direction:"column",xs:10},r.a.createElement(F,{Component:t})))}function Q(e){var t=e.color?"flashBackground":"normalBackground";return r.a.createElement("div",{style:{width:"10%",height:"100%",border:"1px solid #b4b4b4",transform:"translateX(".concat(100*e.translate,"%)"),transition:"".concat(e.transTime?e.transTime:.5,"s ease-in-out")},className:t},r.a.createElement(o.a,{container:!0,justify:"center",alignItems:"center"},r.a.createElement(s.a,{variant:"caption"},e.value)))}function Y(e,t){return!!e&&("Compare"===e.action&&(e.index[0]+1===t.pos||e.index[1]+1===t.pos))}function Z(e){var t=e.action,a=e.values;return null===t?null:r.a.createElement(o.a,{container:!0,justify:"center",alignItems:"center"},r.a.createElement("div",{style:{display:"flex",flexDirection:"row",justifyContent:"center",width:"80%",height:"100%"}},a.map((function(e,a){return r.a.createElement(Q,{key:a,value:e.value,translate:e.shiftPos,transTime:.5,color:Y(t,e)})}))))}var _=a(7),ee=Object(I.a)({root:{margin:"2px"},input:{padding:"2px"}})(m.a),te=a(19);var ae=function(e,t,a,n){n.shiftPos+=e,a.key=t,a.shift=n.pos+e},ne=Object(B.a)((function(e){return{button:{margin:"2px 10px 20px 10px"}}}));function re(e){var t=e.actionList,a=e.numArray,l=e.arrGenerated,i=Object(n.useState)(a.map((function(e,t){return{value:e,pos:t+1,shiftPos:0}}))),c=Object(_.a)(i,2),s=c[0],m=c[1],h=Object(n.useState)(!1),d=Object(_.a)(h,2),b=d[0],E=d[1],p=Object(n.useState)(-1),f=Object(_.a)(p,2),g=f[0],y=f[1],v=Object(n.useState)("Next"),x=Object(_.a)(v,2),S=x[0],j=x[1],w=Object(n.useState)("Start autoplay"),N=Object(_.a)(w,2),O=N[0],A=N[1],C=Object(n.useState)(!1),L=Object(_.a)(C,2),k=L[0],T=L[1],I=Object(n.useState)(!1),B=Object(_.a)(I,2),z=B[0],V=B[1];Object(n.useEffect)((function(){b&&setTimeout(H,1e3)}),[b,g]),Object(n.useEffect)((function(){m(a.map((function(e,t){return{value:e,pos:t+1,shiftPos:0}}))),y(-1),T(!1),j("Next")}),[a,z]);var H=function(){var e,a=0,n=0;if(g>=t.length-1)return T(!0),y(-1),j("Done");if(!k){var r=t[e=g+1].action;if(a=t[e].index[0]+1,n=t[e].index[1]+1,"Swap"===r&&a!==n){var l=n-a,i=Object(te.a)(s),c=[{key:0,shift:0},{key:0,shift:0}];s.forEach((function(e,t){e.pos===a?ae(l,t,c[0],e):e.pos===n&&ae(-l,t,c[1],e)})),i[c[0].key].pos=c[0].shift,i[c[1].key].pos=c[1].shift,m(i)}y(e)}},P=ne();return r.a.createElement("div",{style:{width:"100%"}},l?r.a.createElement(o.a,{container:!0,item:!0,direction:"column",justify:"center",alignItems:"center"},r.a.createElement(o.a,{item:!0,container:!0,direction:"row",justify:"center",alignItems:"center"},r.a.createElement(u.a,{onClick:H,disabled:!(!b&&!k),variant:"outlined",className:P.button},S),r.a.createElement(u.a,{onClick:function(){E(!b),A(b?"Start Autoplay":"Stop Autoplay")},variant:"outlined",disabled:!!k,className:P.button},O),r.a.createElement(u.a,{onClick:function(){V(!z)},variant:"outlined",className:P.button},"Reset")),r.a.createElement(o.a,{container:!0,item:!0,style:{width:"100%"}},r.a.createElement(Z,{action:0!==t.length||-1!==g?t[g]:null,values:s}))):null)}var le=Object(B.a)((function(e){return{root:{padding:"20px"},margin:{marginLeft:"5px",marginRight:"5px"}}}));var ie=Object(h.b)((function(e){return{numArray:e.ui.numArray,actionList:e.ui.actionList,numNums:e.ui.numNums}}),(function(e){return Object(d.b)({getSortData:x,setNumNums:w.actions.setNumNums},e)}))((function(e){var t=e.numArray,a=e.actionList,l=(e.timeout,e.getSortData),i=e.setNumNums,c=e.numNums,s=e.route,m=e.sort,h=Object(n.useState)(!1),d=Object(_.a)(h,2),b=d[0],E=d[1],p=Object(n.useState)(!1),f=Object(_.a)(p,2),g=f[0],y=f[1],v=le();return r.a.createElement(o.a,{container:!0,direction:"column",justify:"center",alignItems:"center",className:v.root,style:{width:"80%",border:"1px solid #d6dacf",borderRadius:"10px",marginBottom:"35px"}},r.a.createElement(o.a,{item:!0,container:!0,direction:"row",justify:"center",alignItems:"flex-start",style:{marginBottom:"25px"}},r.a.createElement(o.a,{item:!0,className:v.margin},r.a.createElement(ee,{variant:"outlined",label:"Number ",margin:"dense",error:g,helperText:g?"Invalid input":null,style:{width:"100px"},onChange:function(e){y(!1),i(e.target.value)},onBlur:function(e){isNaN(parseInt(c))||parseInt(c)<=1?y(!0):y(!1)}})),r.a.createElement(o.a,{item:!0},r.a.createElement(u.a,{variant:"outlined",style:{marginTop:"4px"},onClick:function(){g||(E(!0),l(s,m))}},"Generate random array"))),r.a.createElement(o.a,{container:!0,item:!0},r.a.createElement(re,{numArray:t,actionList:a,arrGenerated:b})))})),ce=Object(B.a)((function(e){return{root:{marginLeft:"10px",marginTop:"5px"},header:{fontSize:30,marginLeft:"10px",marginTop:"5px"},subHeader:{fontSize:15,marginLeft:"10px",marginTop:"0px",marginBottom:"10px"},visualizerHelper:{fontSize:13,marginTop:"10px",marginLeft:"10px"}}}));function oe(e){var t=e.title,a=e.helperText,n=e.route,l=e.sort,i=e.descriptionObj,c=ce();return r.a.createElement(o.a,{container:!0,direction:"column",alignItems:"center",style:{width:"100%"}},r.a.createElement(o.a,{container:!0,item:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:c.header},t)),r.a.createElement(o.a,{item:!0,container:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:c.subHeader},i.description),r.a.createElement(s.a,{variant:"overline",className:c.root},a)),r.a.createElement(o.a,{item:!0,container:!0,justify:"center"},r.a.createElement(s.a,{variant:"overline",className:c.visualizerHelper},"Use the resource below so that you can visualize how the ",t+" ","works. The ",r.a.createElement("b",null,"flashing grey boxes")," represent the elements that are currently being compared. ",r.a.createElement("br",null),r.a.createElement("b",null,"Default list size is 10.")),r.a.createElement(ie,{route:n,sort:l})))}var se={name:"Insertion Sort",description:"Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. \n  It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort."},me=r.a.createElement("div",null,r.a.createElement("p",null,r.a.createElement("h3",null,r.a.createElement("b",null,"Example:")),r.a.createElement("strong",null,"12"),", 11, 13, 5, 6"),r.a.createElement("p",null,"Let us loop for i = 1 (second element of the array) to 4 (last element of the array)"),r.a.createElement("p",null,"i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12",r.a.createElement("br",null),r.a.createElement("strong",null,"11, 12"),", 13, 5, 6"),r.a.createElement("p",null,"i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13",r.a.createElement("br",null),r.a.createElement("strong",null,"11, 12, 13"),", 5, 6"),r.a.createElement("p",null,"i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.",r.a.createElement("br",null),r.a.createElement("strong",null,"5, 11, 12, 13"),", 6"),r.a.createElement("p",null,"i = 4. 6 will move to position after 5, and elements from 11 to 13 will move one position ahead of their current position.",r.a.createElement("br",null),r.a.createElement("strong",null,"5, 6, 11, 12, 13 ")));function ue(){return r.a.createElement(oe,{title:"Insertion Sort",helperText:me,route:"insertion-sort",sort:"insertion",descriptionObj:se})}var he=a(41),de=a(76),be=a.n(de),Ee=[he.a];Ee=[].concat(Object(te.a)(Ee),[be.a]);var pe=Object(d.c)({ui:w.reducer});var fe=function(e){var t=Object(d.d)(d.a.apply(void 0,Object(te.a)(Ee)));return Object(d.e)(pe,e,t)}({}),ge={name:"Bubble Sort",description:"Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order."},ye=r.a.createElement("div",null,r.a.createElement("p",null,r.a.createElement("h3",null,r.a.createElement("b",null,"Example:")),r.a.createElement("b",null,"First Pass:"),r.a.createElement("br",null),"( ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"1")," 4 2 8 ) \u2013> ( ",r.a.createElement("b",null,"1")," ",r.a.createElement("b",null,"5")," 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.",r.a.createElement("br",null),"( 1 ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"4")," 2 8 ) \u2013> ( 1 ",r.a.createElement("b",null,"4")," ",r.a.createElement("b",null,"5")," 2 8 ), Swap since 5 > 4",r.a.createElement("br",null),"( 1 4 ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"2")," 8 ) \u2013> ( 1 4"," ",r.a.createElement("b",null,"2")," ",r.a.createElement("b",null,"5")," 8 ), Swap since 5 > 2",r.a.createElement("br",null),"( 1 4 2 ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"8")," ",") \u2013> ( 1 4 2 ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"8")," ), Now, since these elements are already in order (8 > 5), algorithm does not swap them."),r.a.createElement("p",null,r.a.createElement("b",null,"Second Pass:"),r.a.createElement("br",null),"( ",r.a.createElement("b",null,"1")," ",r.a.createElement("b",null,"4")," 2 5 8 ) \u2013> ( ",r.a.createElement("b",null,"1")," ",r.a.createElement("b",null,"4")," 2 5 8 )",r.a.createElement("br",null),"( 1 ",r.a.createElement("b",null,"4")," ",r.a.createElement("b",null,"2")," 5 8 ) \u2013> ( 1 ",r.a.createElement("b",null,"2")," ",r.a.createElement("b",null,"4")," 5 8 ), Swap since 4 > 2",r.a.createElement("br",null),"( 1 2 ",r.a.createElement("b",null,"4")," ",r.a.createElement("b",null,"5")," 8 ) \u2013> ( 1 2"," ",r.a.createElement("b",null,"4")," ",r.a.createElement("b",null,"5")," 8 )",r.a.createElement("br",null),"( 1 2 4 ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"8")," ) \u2013> ( 1 2 4"," ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"8")," )",r.a.createElement("br",null)," ",r.a.createElement("br",null),"Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one ",r.a.createElement("b",null,"whole")," pass without ",r.a.createElement("b",null,"any")," ","swap to know it is sorted."),r.a.createElement("p",null,r.a.createElement("b",null,"Third Pass:"),r.a.createElement("br",null),"( ",r.a.createElement("b",null,"1")," ",r.a.createElement("b",null,"2")," 4 5 8 ) \u2013> ( ",r.a.createElement("b",null,"1")," ",r.a.createElement("b",null,"2")," 4 5 8 )",r.a.createElement("br",null),"( 1 ",r.a.createElement("b",null,"2")," ",r.a.createElement("b",null,"4")," 5 8 ) \u2013> ( 1 ",r.a.createElement("b",null,"2")," ",r.a.createElement("b",null,"4")," 5 8 )",r.a.createElement("br",null),"( 1 2 ",r.a.createElement("b",null,"4")," ",r.a.createElement("b",null,"5")," 8 ) \u2013> ( 1 2 ",r.a.createElement("b",null,"4")," ",r.a.createElement("b",null,"5")," 8 )",r.a.createElement("br",null),"( 1 2 4 ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"8")," ) \u2013> ( 1 2 4 ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"8")," )"));function ve(){return r.a.createElement(oe,{title:"Bubble Sort",helperText:ye,route:"bubble-sort",sort:"bubble",descriptionObj:ge})}var xe={name:"Selection Sort",description:"The selection sort algorithm sorts an array by repeatedly finding the minimum element \n  (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array."},Se=r.a.createElement("div",null,r.a.createElement("p",null,r.a.createElement("h3",null,r.a.createElement("b",null,"Example:")),r.a.createElement("b",null,"First Pass:"),r.a.createElement("br",null),"( ",r.a.createElement("b",null,"5")," ",r.a.createElement("b",null,"1")," 4 2 ) \u2013> ( ",r.a.createElement("b",null,"1")," ",r.a.createElement("b",null,"5")," 4 2 ),"," ",r.a.createElement("br",null),"Here, the algorithm finds the smallest element - 1 - and swaps it with the first element."),r.a.createElement("p",null,r.a.createElement("b",null,"Second Pass:"),r.a.createElement("br",null),"( 1 ",r.a.createElement("b",null,"5")," 4 ",r.a.createElement("b",null,"2")," ) \u2013> ( 1 ",r.a.createElement("b",null,"2")," 4 ",r.a.createElement("b",null,"5")," ),"," ",r.a.createElement("br",null),"Here, the algorithm finds the 2nd smallest element - 2 - and swaps it with the second element ."),r.a.createElement("p",null,r.a.createElement("b",null,"Third Pass:"),r.a.createElement("br",null),"( 1 2 ",r.a.createElement("b",null,"4")," ",r.a.createElement("b",null,"5")," ) \u2013> ( 1 2 ",r.a.createElement("b",null,"4")," ",r.a.createElement("b",null,"5")," ),"," ",r.a.createElement("br",null),"Here, the algorithm finds the 3rd smallest element - 4. But since it is already in the right place, it doesn't swap places."));function je(){return r.a.createElement(oe,{title:"Selection Sort",helperText:Se,route:"selection-sort",sort:"selection",descriptionObj:xe})}function we(e){var t=e.action,a=e.numArray,n=e.searchValBox;return console.log("valBox",n,a),console.log("action",t),null===t?null:r.a.createElement(o.a,{container:!0,justify:"center",alignItems:"center",direction:"column"},r.a.createElement(Q,{value:n.value,color:!0}),r.a.createElement("div",{style:{display:"flex",flexDirection:"row",justifyContent:"center",width:"80%",height:"100%"}},a.map((function(e,a){return r.a.createElement(Q,{key:a,value:e,color:void 0!==t&&(n=a,l=t.index[0],n===l)});var n,l}))))}var Ne=Object(B.a)((function(e){return{button:{margin:"2px 10px 20px 10px"},error:{fontSize:16,color:"green"}}}));function Oe(e){var t=e.actionList,a=e.numArray,l=e.arrGenerated,i=e.searchVal,c=e.searchIndex,m=Object(n.useState)({value:i,pos:1,shiftPos:0}),h=Object(_.a)(m,2),d=h[0],b=h[1],E=Object(n.useState)(!1),p=Object(_.a)(E,2),f=p[0],g=p[1],y=Object(n.useState)(0),v=Object(_.a)(y,2),x=v[0],S=v[1],j=Object(n.useState)("Next"),w=Object(_.a)(j,2),N=w[0],O=w[1],A=Object(n.useState)("Start autoplay"),C=Object(_.a)(A,2),L=C[0],k=C[1],T=Object(n.useState)(!1),I=Object(_.a)(T,2),B=I[0],z=I[1],V=Object(n.useState)(!1),H=Object(_.a)(V,2),P=H[0],R=H[1];Object(n.useEffect)((function(){b({value:i,pos:1,shiftPos:0}),S(0),z(!1),O("Next")}),[a,P]),Object(n.useEffect)((function(){f&&setTimeout(D,1e3)}),[f,x]);var D=function(){if(console.log("reached",x),x>=t.length-1)return z(!0),S(-1),O("Done");B||(console.log("preivous",d),S(x+1))},U=Ne();return r.a.createElement("div",{style:{width:"100%"}},l?r.a.createElement(o.a,{container:!0,item:!0,direction:"column",justify:"center",alignItems:"center"},-1===x?r.a.createElement(o.a,{item:!0,container:!0,justify:"center"},r.a.createElement(s.a,{variant:"overline",className:U.error},"Number found at index ",c)):null,r.a.createElement(o.a,{item:!0,container:!0,direction:"row",justify:"center",alignItems:"center"},r.a.createElement(u.a,{onClick:function(){return D()},disabled:!(!f&&!B),variant:"outlined",className:U.button},N),r.a.createElement(u.a,{onClick:function(){g(!f),k(f?"Start Autoplay":"Stop Autoplay")},variant:"outlined",disabled:!!B,className:U.button},L),r.a.createElement(u.a,{onClick:function(){R(!P)},variant:"outlined",className:U.button},"Reset")),r.a.createElement(o.a,{container:!0,item:!0,style:{width:"100%"}},console.log("actionList",t,x),r.a.createElement(we,{action:0!==t.length||-1!==x?t[x]:null,numArray:a,searchValBox:d}))):null)}var Ae=Object(B.a)((function(e){return{root:{padding:"20px",marginBottom:"35px"},margin:{marginLeft:"5px",marginRight:"5px"},error:{}}}));var Ce=Object(h.b)((function(e){return{numArray:e.ui.numArray,actionList:e.ui.actionList,numNums:e.ui.numNums,searchVal:e.ui.searchVal,searchIndex:e.ui.searchIndex}}),(function(e){return Object(d.b)({getSearchData:S,setNumNums:w.actions.setNumNums,setSearchValForm:w.actions.setSearchValForm},e)}))((function(e){var t=e.numArray,a=e.actionList,l=(e.timeout,e.getSearchData),i=e.setSearchValForm,c=e.numNums,s=e.setNumNums,m=e.searchIndex,h=e.searchVal,d=e.route,b=e.search,E=Object(n.useState)(!1),p=Object(_.a)(E,2),f=p[0],g=p[1],y=Object(n.useState)(!1),v=Object(_.a)(y,2),x=v[0],S=v[1],j=Object(n.useState)(!1),w=Object(_.a)(j,2),N=w[0],O=w[1],A=Ae();return r.a.createElement(o.a,{container:!0,direction:"column",justify:"center",alignItems:"center",className:A.root,style:{width:"80%",border:"1px solid #d6dacf",borderRadius:"10px"}},r.a.createElement(o.a,{item:!0,container:!0,direction:"row",justify:"center",alignItems:"flex-start",style:{marginBottom:"25px"}},r.a.createElement(o.a,{item:!0,className:A.margin},r.a.createElement(ee,{variant:"outlined",label:"Array size",margin:"dense",style:{width:"100px"},error:!!x,helperText:x?"Size must be greater than 0":null,onChange:function(e){s(parseInt(e.target.value))}})),r.a.createElement(o.a,{item:!0},r.a.createElement(u.a,{variant:"outlined",style:{margin:"4px"},onClick:function(){c>0?h<=c&&-1!==h?(g(!0),l(d,b,h),O(!1),S(!1)):O(!0):S(!0)}},"Display Array")),r.a.createElement(o.a,{item:!0,className:A.margin},r.a.createElement(ee,{variant:"outlined",label:"Value search",margin:"dense",style:{width:"150px"},error:!!N,helperText:N?"Value must be less than or equal to the array size. Value also cannot be empty.":null,onChange:function(e){i(parseInt(e.target.value))}}))),0!==t.length?r.a.createElement(o.a,{container:!0,item:!0},r.a.createElement(Oe,{numArray:t,actionList:a,arrGenerated:f,searchVal:h,searchIndex:m})):null)})),Le=Object(B.a)((function(e){return{root:{marginLeft:"10px",marginTop:"5px"},header:{fontSize:30,marginLeft:"10px",marginTop:"5px"},subHeader:{fontSize:15,marginLeft:"10px",marginTop:"0px",marginBottom:"10px"},visualizerHelper:{fontSize:13,marginTop:"10px",marginLeft:"10px"}}}));function ke(e){var t=e.title,a=e.helperText,n=e.route,l=e.search,i=e.descriptionObj,c=Le();return r.a.createElement(o.a,{container:!0,direction:"column",alignItems:"center",style:{width:"100%"}},r.a.createElement(o.a,{container:!0,item:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:c.header},t)),r.a.createElement(o.a,{item:!0,container:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:c.subHeader},i.description),r.a.createElement(s.a,{variant:"overline",className:c.root},a)),r.a.createElement(o.a,{item:!0,container:!0,justify:"center"},r.a.createElement(s.a,{variant:"overline",className:c.visualizerHelper},"Use the resource below so that you can visualize how the ",t+" ","works. The ",r.a.createElement("b",null,"flashing grey boxes")," represent the elements that are currently being compared."),r.a.createElement(o.a,{item:!0,container:!0,justify:"center"},r.a.createElement(Ce,{route:n,search:l}))))}var Te={name:"Binary Search",description:"Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array. \n    If the value of the search key is less than the item in the middle of the interval, \n    narrow the interval to the lower half. Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty."},Ie=r.a.createElement("div",null,r.a.createElement("h2",null,"NOTE: For binary search, the array must first be sorted in ASCENDING order."),r.a.createElement("p",null,r.a.createElement("h3",null,r.a.createElement("b",null,"Example:")),r.a.createElement("b",null,"Search for the value 23.")," ",r.a.createElement("br",null),r.a.createElement("b",null,"First Pass:"),r.a.createElement("br",null),"( 2 5 8 12 16 23 38 56 72 91) Cut the array in half. Check if the middle element is 23. ",r.a.createElement("br",null),"The middle element is 16 ( 2 5 8 12 ",r.a.createElement("b",null,"16")," 23 38 56 72 91). Since 23 > 16, take the 2nd half. ( 2 5 8 12 16 ",r.a.createElement("b",null,"23 38 56 72 91"),")."),r.a.createElement("p",null,r.a.createElement("b",null,"Second Pass:")," ",r.a.createElement("br",null),"(23 38 56 72 91) Cut this array in half. Check if the middle element is 23. ",r.a.createElement("br",null),"The middle element is 56 (23 38 ",r.a.createElement("b",null,"56")," 72 91). Since 23 < 56, take the 1st half. (",r.a.createElement("b",null,"23 38")," 56 72 91)."),r.a.createElement("p",null,r.a.createElement("b",null,"Third Pass:")," ",r.a.createElement("br",null),"(23 38) Cut this array in half. Check if the middle element is 23 (round down to the nearest element). ",r.a.createElement("br",null),"The middle element is 23 (",r.a.createElement("b",null,"23")," 38). Since this element is 23, return this index with respect to the entire array. ( 2 5 8 12 16 ",r.a.createElement("b",null,"23")," 38 56 72 91). The binary search returns 5"));function Be(){return r.a.createElement(ke,{title:"Binary Search",helperText:Ie,route:"binary-search",search:"binary",descriptionObj:Te})}var ze={name:"Linear Search",description:"Search through an array by starting at the leftmost element and one by one comparing each element to the search value. This algorithm is\n  much slower than the binary search, especially for large arrays. However, linear search algorithms do not require the array to be pre-sorted."},Ve=r.a.createElement("div",null,r.a.createElement("h2",null,"NOTE: For linear search, the array ",r.a.createElement("b",null,"does not")," need to be sorted. This is the advantage of the linear search algorithm."),r.a.createElement("p",null,r.a.createElement("h3",null,r.a.createElement("b",null,"Example:")),r.a.createElement("b",null,"Search for the value 23.")," ",r.a.createElement("br",null),r.a.createElement("b",null,"First Pass:"),r.a.createElement("br",null),"( ",r.a.createElement("b",null,"10")," 50 23 60 19 ) Check if the first element is 23. ",r.a.createElement("br",null),"Since the first element is not 23, move onto the next element."),r.a.createElement("p",null,r.a.createElement("b",null,"Second Pass:"),r.a.createElement("br",null),"( 10 ",r.a.createElement("b",null,"50")," 23 60 19 ) Check if the second element is 23. ",r.a.createElement("br",null),"Since the second element is not 23, move onto the next element."),r.a.createElement("p",null,r.a.createElement("b",null,"Third Pass:"),r.a.createElement("br",null),"( 10 50 ",r.a.createElement("b",null,"23")," 60 19 ) Check if the third element is 23. ",r.a.createElement("br",null),"Since the third element ",r.a.createElement("b",null,"is")," 23, return the index value ",r.a.createElement("b",null,"2"),"."));function He(){return r.a.createElement(ke,{title:"Linear Search",helperText:Ve,route:"linear-search",search:"linear",descriptionObj:ze})}var Pe=a(23),Re=a(160),De=a(161),Ue=a(168),Ge=a(165),Fe=a(167),We=Object(B.a)((function(e){return{root:{marginLeft:"10px",marginTop:"5px"},header:{fontSize:30,marginLeft:"10px",marginTop:"5px"},subHeader:{fontSize:15,marginLeft:"10px",marginTop:"0px",marginBottom:"10px"},visualizerHelper:{fontSize:13,marginTop:"10px",marginLeft:"10px",marginBottom:"15px"},textArea:{width:"100%",resize:"none",borderRadius:"10px"},buttonSelect:{margin:"10px","&:focus":{background:"#d6dacf"},"&:active":{background:"#d6dacf"}}}}));var qe=Object(h.b)((function(e){return{userCode:e.ui.userCode,actionList:e.ui.actionList,numArray:e.ui.numArray,userCodeErr:e.ui.userCodeErr,algorithm:e.ui.algorithm,status:e.ui.status,searchVal:e.ui.searchVal}}),(function(e){return Object(d.b)({setUserCode:w.actions.setUserCode,setAlgorithm:w.actions.setAlgorithm,sendUserData:j},e)}))((function(e){var t=We(),a=Object(n.useState)(!1),l=Object(_.a)(a,2),i=l[0],c=l[1],m=Object(n.useState)(),h=Object(_.a)(m,2),d=(h[0],h[1],Object(n.useState)(!1)),b=Object(_.a)(d,2),E=b[0],p=b[1],f=Object(n.useState)(!0),g=Object(_.a)(f,2),y=g[0],v=g[1];return r.a.createElement(o.a,{container:!0,direction:"column",alignItems:"center",style:{width:"100%",height:"100vh"}},r.a.createElement(o.a,{container:!0,item:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:t.header},"User Code Visualizer")),r.a.createElement(o.a,{item:!0,container:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:t.subHeader},"Enter your own sort/search code here and visualize its effect on a list."),r.a.createElement(s.a,{variant:"overline",className:t.root},"temp for now")),r.a.createElement(o.a,{item:!0,container:!0,justify:"flex-start"},r.a.createElement(s.a,{variant:"overline",className:t.visualizerHelper},"Enter your code below."),r.a.createElement(o.a,{item:!0,container:!0,direction:"column",alignItems:"center",justify:"center"},r.a.createElement(o.a,{item:!0,style:{width:"60%"}},r.a.createElement(s.a,{variant:"h4"},e.userCodeErr.err),"sort"===e.algorithm?r.a.createElement(s.a,null,"public class Test implements Sort ","{",r.a.createElement("br",null),"\u2003public void sort(SimpleArray arr) ","{"," */method body written here */","}","}"):r.a.createElement(s.a,null,"public class Test implements Search ","{",r.a.createElement("br",null),"\u2003public void search(SimpleArray arr, int searchVal) ","{","*/method body written here */","}","}"),r.a.createElement(Re.a,{variant:"outlined",rowsMin:4,placeholder:"Method body",className:t.textArea,onChange:function(t){return e.setUserCode(t.target.value)}})),i?r.a.createElement(o.a,{item:!0},r.a.createElement(s.a,{style:{color:"red"},className:t.subHeader,variant:"overline"},"Select an algorithm first (search or sort).")):null,r.a.createElement(o.a,{item:!0,container:!0,direction:"row",justify:"center",className:t.visualizerHelper},r.a.createElement(o.a,Object(Pe.a)({item:!0,style:{margin:"5px"}},"style",{borderRadius:"10px",border:"1px solid #d6dacf"}),r.a.createElement(De.a,{component:"fieldset",style:{padding:"10px"}},r.a.createElement(o.a,{container:!0,item:!0,justify:"center"},r.a.createElement(s.a,null,"Algorithm Selection")),r.a.createElement(Ue.a,{row:!0,"aria-label":"Algorithm",name:"Algorithm",onChange:function(){return E?e.setAlgorithm("search"):e.setAlgorithm("sort")}},r.a.createElement(Ge.a,{value:"sort",control:r.a.createElement(Fe.a,{onChange:function(){p(!0),v(!1)},checked:E}),label:"Sort"}),r.a.createElement(Ge.a,{value:"search",control:r.a.createElement(Fe.a,{onChange:function(){p(!1),v(!0)},checked:y}),label:"Search"}))))),r.a.createElement(o.a,{item:!0,container:!0,justify:"center",style:{marginBottom:"20px"}},r.a.createElement(u.a,{variant:"outlined",onClick:function(){""!==e.algorithm?e.sendUserData():c(!0)}},"Submit Code")),r.a.createElement(o.a,{item:!0,container:!0,justify:"center"},e.status?"search"===e.algorithm?r.a.createElement(Oe,{actionList:e.actionList,numArray:e.numArray,arrGenerated:!0,searchVal:e.searchVal}):r.a.createElement(re,{actionList:e.actionList,numArray:e.numArray,arrGenerated:!0}):null))))}));var Je=function(){return r.a.createElement(h.a,{store:fe},r.a.createElement(c.b,{history:g},r.a.createElement(c.c,null,r.a.createElement(c.a,{exact:!0,path:"/user-code"},r.a.createElement(K,{Component:r.a.createElement(qe,null)})),r.a.createElement(c.a,{exact:!0,path:"/binary-search"},r.a.createElement(K,{Component:r.a.createElement(Be,null)})),r.a.createElement(c.a,{exact:!0,path:"/selection-sort"},r.a.createElement(K,{Component:r.a.createElement(je,null)})),r.a.createElement(c.a,{exact:!0,path:"/insertion-sort"},r.a.createElement(K,{Component:r.a.createElement(ue,null)})),r.a.createElement(c.a,{exact:!0,path:"/bubble-sort"},r.a.createElement(K,{Component:r.a.createElement(ve,null)})),r.a.createElement(c.a,{exact:!0,path:"/binary-search"},r.a.createElement(K,{Component:r.a.createElement(Be,null)})),r.a.createElement(c.a,{exact:!0,path:"/linear-search"},r.a.createElement(K,{Component:r.a.createElement(He,null)})),r.a.createElement(c.a,{exact:!0,path:"/random"},r.a.createElement(K,{Component:r.a.createElement(R,null)})),r.a.createElement(c.a,{path:"/"},r.a.createElement(K,null)))))};Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));i.a.render(r.a.createElement(Je,null),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))},88:function(e,t,a){e.exports=a(119)},93:function(e,t,a){}},[[88,1,2]]]);