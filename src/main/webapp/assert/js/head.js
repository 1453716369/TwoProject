$(function () {

    $("#download").hover(
      function () {
           $(".download").slideDown("500")
      },function () {
             $(".download").slideUp("500")
        }
    )
    $(".shopcar").hover(
        function () {
            $("#shopcar").slideDown("500")
        },function () {
            $("#shopcar").slideUp("500")
        }
    )
    $(".daohang").hover(function () {
        $("#proClass").fadeIn("500")
    },function () {
        $("#proClass").fadeOut("500")
        }
    )
})