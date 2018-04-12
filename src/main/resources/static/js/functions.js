var coffees = 0;
var serviceInterval = 50;
var lang = 'en';

var filledPot = function () {
    return ($(".potFilled").is(':visible') && $(".pot").is(':visible'));
};

var noPot = function () {
    return !$(".pot").is(':visible');
};


var getLocalizedMessage = function (type, lang) {
    if (lang === 'de') {
        switch (type) {
            case 'Welcome' :
                return 'Willkommen';
            case 'Standby':
                return 'Bitte den Einschaltknopf drücken!';
        }
    }
    if (lang === 'en') {
        switch (type) {
            case 'Welcome' :
                return 'Welcome!';
            case 'Standby':
                return 'Push Power to start coffee machine!';
            case 'Clean':
                return 'Please clean the machine';
            case 'Pot':
                return 'Please insert coffee pot!';
            case 'Coffee':
                return 'Please take your coffee!';
        }
    }
};

var setMessage = function (type) {
    $(".message").find("span").text(getLocalizedMessage(type, lang));
};

var requireCleaning = function () {
    setMessage('Clean');
    setTimeout(function () {
        setMessage('Welcome');
    }, 10000);
};


$(document).ready(function () {
    setMessage('Standby');
    $(".power").click(function () {
        $(this).toggleClass("on");
        var isOn = $(".power").hasClass("on");
        setMessage(isOn ? 'Welcome' : 'Standby');
    });

    $(".brew").click(function () {
        $(this).fadeOut(100).fadeIn(100).fadeOut(100).fadeIn(100);
        var isOn = $(".power").hasClass("on");
        if (isOn) {
            if (filledPot()) {
                setMessage('Coffee');
            } else if (noPot()) {
                setMessage('Pot');
                setTimeout(function () {
                    setMessage('Welcome');
                }, 10000);
            }
            else {
                if (coffees >= serviceInterval) {
                    requireCleaning();
                } else {
                    $(".potFilled").show();
                    coffees++;
                }
            }
        }
    });

    $(".clean").click(function () {
        $(this).fadeOut(100).fadeIn(100).fadeOut(100).fadeIn(100);
        coffees = 0;
    });

    $(".tray").click(function () {
        if (filledPot()) {
            $(".potFilled").hide();
            $(".pot").hide();
        } else {
            $(".pot").toggle();
        }
    });

    $("#languages").change(function (val) {
        lang = val.target.value;
        var isOn = $(".power").hasClass("on");
        setMessage(isOn ? 'Welcome' : 'Standby');
    });

    $("#serviceInterval").change(function (val) {
        serviceInterval = val.target.value;
    });

});
