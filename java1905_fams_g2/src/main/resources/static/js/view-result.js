$(function() {
    $("#add-entry").click(function() {
        $trbody = $("#tbl-resultentry").find("tbody")
        $trlast = $trbody.find("tr:last");
        $row = $trlast.clone();
        $trlast.after($row);
    });
    $(document).on("click", ".del-entry", function() {
        $(this).closest('tr').remove();
    });

    $("#add-interview").click(function() {
        $trbody = $("#tbl-resultinterview").find("tbody")
        $trlast = $trbody.find("tr:last");
        $row = $trlast.clone();
        $trlast.after($row);
    });
    $(document).on("click", ".del-interview", function() {
        $(this).closest('tr').remove();

    });

    $("#expand-tbl").click(function() {
        $(".tbody1").toggle();
    });
    $("#expand-tblinter").click(function() {
        $(".tbody2").toggle();
    });
    $("#expand-tbl1").click(function() {
        $(".tbl-tbody1").toggle();
    });
    $("#expand-tbl2").click(function() {
        $(".tbl-tbody2").toggle();
    });
});