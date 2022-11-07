# Add any ProGuard configurations specific to this
# extension here.

-keep public class htmlformat.bybug.net.htmlformat.htmlformat {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'htmlformat/bybug/net/htmlformat/repack'
-flattenpackagehierarchy
-dontpreverify
