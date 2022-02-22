var crud = {};

crud.init = function (){
    $('#index #btnGoHome').on('click', function (){
        $('#index').load('./');
    })

    $('#index #btnInsertGo').on('click', function (){
        $('#index').load('./insertGo');
    })

    $('#index #btnSearchGo').on('click', function (){
        $('#index').load('./searchGo');
    })

    $('#index #btnInsert').on('click', function (){
        var frm = $('#frm_insert')[0];
        var param = $(frm).serialize();

        $.ajax({
            type    :   'POST',
            url     :   './insert',
            data    :   param,
            success :   function (resp){
                $('index').load('./searchGo');
            }
        })
    })

    $('#index #btnSearch').on('click', function (){
       $('#index').load('./search');
    })
}