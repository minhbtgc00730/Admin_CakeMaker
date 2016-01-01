/**
 * Created by Bui on 12/25/2015.
 */
$(document).ready(function () {
    //Parse.initialize("l5OJy4F4rw3COKG6Jgc0VKNi7rFQzarUVLcjw4jA", "TGgwYdHCXuj0QAgeEtwciNWtGylQ4W20iG20lWxx")
    Parse.initialize("your", "credenticals")

    var GameScore = Parse.Object.extend("GameScore");
    var query = new Parse.Query(GameScore);
    query.equalTo("playerName", "Dan Stemkoski");
    query.find({
        success: function (results) {
            for (var i = 0; i < results.length; i++) {
                var object = results[i];
                (function ($) {
                    $('#results-table').append('<tr><td>' + object.get('playerName') + '</td><td>' + object.get('score') + '</td></tr>');
                })(jQuery);
            }
        },
        error: function (error) {
            alert("Error: " + error.code + " " + error.message);
        }
    });
});