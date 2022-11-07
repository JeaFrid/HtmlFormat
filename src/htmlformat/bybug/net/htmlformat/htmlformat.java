package htmlformat.bybug.net.htmlformat;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;


public class htmlformat extends AndroidNonvisibleComponent {

  public htmlformat(ComponentContainer container) {
    super(container.$form());
  }

//-- -- -- Function | HTML Blocks -- -- --

      @SimpleFunction
      public String CreateHTML(String title, String text){
        return "<html><head><title>"+title+"</title></head><body>"+text+"</body></html>";
      }
      @SimpleFunction
      public String Bold(String text){
        return "<b>"+text+"</b>";
      }
      @SimpleFunction
      public String Italic(String text){
        return "<i>"+text+"</i>";
      }
      @SimpleFunction
      public String Paragraph(String text){
        return "<p>"+text+"</p>";
      }
      @SimpleFunction
      public String Underlined(String text){
        return "<u>"+text+"</u>";
      }
      @SimpleFunction
      public String StrikeThrough(String text){
        return "<del>"+text+"</del>";
      }
      @SimpleFunction
      public String Big(String text){
        return "<big>"+text+"</big>";
      }
      @SimpleFunction
      public String Small(String text){
        return "<small>"+text+"</small>";
      }
      @SimpleFunction
      public String SetFont(String fontName, String color, String text){
        return "<font face="+fontName+" color="+color+">"+text+"</font>";
      }
      @SimpleFunction
      public String CreateLink(String link, String text){
        return "<a href="+"'"+link+"'"+">"+text+"</a>";
      }
      @SimpleFunction
      public String CreateEMail(String email, String text){
        return "<a href="+"'mailto:"+email+"'"+">"+text+"</a>";
      }
      @SimpleFunction
      public String StartItemList(){
        return "<ul>";
      }
      @SimpleFunction
      public String StartNumberList(){
        return "<ol>";
      }
      @SimpleFunction
      public String AddListItem(String text){
        return "<li>"+text+"</li>";
      }
      @SimpleFunction
      public String FinishNumberList(){
        return "</ol>";
      }
      @SimpleFunction
      public String FinishItemList(){
        return "</ul>";
      }
      @SimpleFunction
      public String CreateTextbox(String name, String text, String size){
        return "<b>"+text+"</b><br />"+"<input type='"+"text"+"' name='"+name+"' size='"+24+"'><br /><br />";
      }
      @SimpleFunction
      public String CreateButton(String name, String text){
        return "<input type='submit' name='"+name+"' value='"+text+"'><br /><br />";
      }
      @SimpleFunction
      public String CreateImage(String imageLink, String text){
        return "<img src='"+imageLink+"' alt='"+text+"'/>";
      }
      @SimpleFunction
      public String Header1(String text){
        return "<h1>"+text+"</h1>";
      }
      @SimpleFunction
      public String Header2(String text){
        return "<h2>"+text+"</h2>";
      }
      @SimpleFunction
      public String Header3(String text){
        return "<h3>"+text+"</h3>";
      }
      @SimpleFunction
      public String Header4(String text){
        return "<h4>"+text+"</h4>";
      }
      @SimpleFunction
      public String Header5(String text){
        return "<h5>"+text+"</h5>";
      }
      @SimpleFunction
      public String Header6(String text){
        return "<h6>"+text+"</h6>";
      }
      @SimpleFunction
      public String SkipToBottomLine(){
        return "<br />";
      }

//-- -- -- Properties | Colors -- -- -- 

      @SimpleProperty
      public String ColorBlack(){
        return "<body bgcolor='black'>";
      }
      @SimpleProperty
      public String ColorRed(){
        return "<body bgcolor='red'>";
      }
      @SimpleProperty
      public String ColorWhite(){
        return "<body bgcolor='white'>";
      }
      @SimpleProperty
      public String ColorGreen(){
        return "<body bgcolor='green'>";
      }
      @SimpleProperty
      public String ColorPurple(){
        return "<body bgcolor='purple'>";
      }
      @SimpleProperty
      public String ColorBlue(){
        return "<body bgcolor='blue'>";
      }
      @SimpleProperty
      public String ColorPink(){
        return "<body bgcolor='pink'>";
      }
     @SimpleProperty
      public String ColorGrey(){
        return "<body bgcolor='grey'>";
      }
      @SimpleProperty
      public String ColorYellow(){
        return "<body bgcolor='yellow'>";
      }
  }