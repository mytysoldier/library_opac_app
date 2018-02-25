/**
 * 要素を取得
 */
// タブメニューからAタグの要素を取得する
var tabs = document.getElementById('menutab').getElementsByTagName("a");
// ページコンテンツからDIVタグの要素を取得する
var pages = document.getElementById('pageContents').getElementsByTagName('div');

/**
 * タブの切り替え処理
 */
function changeTab(){
	// href属性から対象となるId名を取得する
	var targetId = this.href.substring(this.href.indexOf('#')+1, this.href.length);
	// 指定のタブページだけを表示する
	for(var i=0; i<pages.length; i++){
		if(pages[i].id != targetId){
			pages[i].style.display = "none";
		} else {
			pages[i].style.display = "block";
		}
	}
	// クリックされたタブを前面に表示する
	for(var i=0; i<tabs.length; i++){
		tabs[i].style.zIndex = "0";
	}
	this.style.zIndex = "10";
	// falseを返却しページ遷移しないようにする
	return false;
}
// すべてのタブに対して、ボタンクリックされたらchangeTab関数が適用されるようにする
for(var i=0; i<tabs.length; i++){
	tabs[i].onclick = changeTab;
}
// はじめは先頭のタブを表示しておく
tabs[0].onclick();
