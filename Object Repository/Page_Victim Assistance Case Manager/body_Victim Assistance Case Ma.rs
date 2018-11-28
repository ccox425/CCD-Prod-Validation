<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Victim Assistance Case Ma</name>
   <tag></tag>
   <elementGuidId>4a1cbdee-3522-4cad-887c-c7415f99f96a</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            
                    
        
            
                
                    
                        
                        
                    
                    
                        Victim Assistance Case Manager
                        
                    
                    
                        
                            Welcome Cameron Cox  | Contact
                        
                    
                    

                
            
        
    

            
              
            
            
                    
                    
                        
                            
                                My Dashboard
                                Cases
                                Reports
                                Audit Logs
                                    
                                        Administration 
                                        
                                            Manage Reference Tables
                                        
                                    
                            
                        
                    

                    
                    
            
                    

                        

                        
                        
                            




    
        
            
            Search 
    
 
 
   

        $(document).ready(function () {
            // Bind the search button to submit the search form.
            $(&quot;#btnSearch&quot;).bind(&quot;click&quot;, function (e) {
                $(&quot;#searchForm&quot;).submit();
            });
        });

    





    


    .page-splash-message {
        height: 400px;
        padding-top: 150px;
    }

    .page-splash {
        position: fixed;
        top: 0;
        left: 0;
        width: 100%;
        height: 100%;
        background-color: #1f1f1f;
        opacity: 0.2;
        pointer-events: auto;
        -webkit-backface-visibility: hidden;
        -moz-backface-visibility: hidden;
        backface-visibility: hidden;
        -webkit-transition: opacity 0.1s linear;
        -moz-transition: opacity 0.1s linear;
        -o-transition: opacity 0.1s linear;
        transition: opacity 0.1s linear;
    }

    .page-splash-message {
        text-align: center;
        margin: 10% 0 0 0;
        font-size: 400%;
        font-family: &quot;Segoe UI&quot;, Arial, Helvetica, sans-serif;
        font-weight: normal;
        -webkit-text-shadow: 2px 2px rgba(0, 0, 0, 0.15);
        text-shadow: 2px 2px rgba(0, 0, 0, 0.15);
        text-transform: uppercase;
        text-decoration: none;
        font-family: monospace;
        color: #F58A00;
        padding: 0;
    }

    .page-progress-bar {
        margin: 10% 30% 0 30%;
    }




    
        
            
                 Loading...
                
                     
                
            
        
    


    
    
        
            
                
                    Search Results
                
                
                     Create New Case
                
            
        
        
            
                
                    
                        
                            VAU Case #
                            GO #
                            Last Name
                            First Name
                            Date of Birth
                            Case Date
                        
                    
                    
                        
                            V2018-159769
                            2018797314
                            SMITH
                            ANTONETTE
                            September 25, 1974
                            November 24, 2018
                        
                    
                        
                            V2018-159728
                            2018794353
                            SMITH
                            JIBRIL
                            January 1, 2016
                            November 22, 2018
                        
                    
                        
                            V2018-159728
                            2018794353
                            SMITH
                            SAFEERAH
                            April 20, 2014
                            November 22, 2018
                        
                    
                        
                            V2018-159531
                            2018785163
                            Smith 
                            Kristina 
                            August 12, 1990
                            November 18, 2018
                        
                    
                        
                            V2018-159563
                            2018783989
                            Smith
                            Ada
                            September 7, 1928
                            November 17, 2018
                        
                    
                        
                            V2018-159330
                            2018772492
                            SMITH
                            NICK
                            December 18, 1985
                            November 12, 2018
                        
                    
                        
                            V2018-159389
                            2018769335
                            Smith 
                            Shawn 
                            
                            November 11, 2018
                        
                    
                        
                            V2018-159315
                            2018769635
                            SMITH
                            JASON
                            March 22, 1974
                            November 11, 2018
                        
                    
                        
                            V2018-159285
                            2018767748
                            SMITH
                            SHIRLEY
                            October 5, 1989
                            November 10, 2018
                        
                    
                        
                            V2018-159091
                            2018753062
                            SMITH
                            HANNAH
                            May 1, 1998
                            November 4, 2018
                        
                    
                
            

            
                
                    page 1 of 119
                    5102550100 per page
                
                
                    
                        &lt;&lt;
                        &lt;
                        
                            1
                        
                            2
                        
                            3
                        
                            4
                        
                            5
                        
                        >
                        >>
                    
                
            
        
    



    var searchText = 'smith';
    var apiLocation = '/VictimAssistanceUnit/api/';
    localStorage.pageSize = localStorage.pageSize == null ? 10 : localStorage.pageSize;
    localStorage.sortCases = localStorage.sortCases == null ? 'CaseDate:DESC' : localStorage.sortCases;




                            
                        
                        
                    

                    

            
            
                
                 Copyright © 2018 City and County of Denver Version: 1.0.3.30
                
            

        
        

        
        

            $(document).ready(function () {

                // A variable to store whatever AJAX call might be happening so that we can correct the correct problem!  When making CORS calls
                // the local &quot;error&quot; event won't happen so we have to trap those with the document handler defined below, this supports that handler.
                var currentAjaxOp = &quot;&quot;;

                // Make sure we wire up the ajaxError handler in case the call to the CDN fails to get the header and footer.  We may
                // need some type of fall-back header/footer???
                $(document).bind(&quot;ajaxError&quot;, function () {

                    // Depending on which operation was active load the alternate header or footer here...
                    if (currentAjaxOp == &quot;GetHeader&quot;) {

                    }
                    if (currentAjaxOp == &quot;GetFooter&quot;) {
                    }

                });

                //Tab Handling
                var url = window.location.pathname;
                if (url.indexOf('/') > -1) {
                    var urlArr = url.split('/');
                    var controller = urlArr[1].toLowerCase();
                    if (controller.indexOf('victimassistanceunit') > -1) {
                        controller = urlArr[2];
                        if (controller != null)
                            controller = controller.toLowerCase();
                    }
                    switch (controller) {
                        case 'account':
                        case 'merge':
                            controller = 'tab-home';
                            break;
                        case 'letter':
                        case 'search':
                        case 'victim':
                            controller = 'tab-case';
                            break;
                        default:
                            if (controller)
                                controller = 'tab-' + controller;
                            else
                                controller = 'tab-home';
                    }
                    $('#uppernav li').removeClass('active');
                    $('#' + controller).addClass('active');
                }

                // Now load the header and footer HTML.
                LoadHeaderAndFooter();
            });

            //
            // Retrieves the Header and Footer resources from the CDN and loads the contents into the correct div element.
            //
            function LoadHeaderAndFooter() {
                var appVersion = '1.0.3.30';
                // Resource retrieval error flag.
                var resourceRetrievalFailure = false;

                // Get the header and footer loaded from the CDN and replace any values as needed such as the app title and sub-title.
                $.ajax({
                    url: &quot;/AppModernizationCDN/Resource/SafetyHeader&quot;,
                    dataType: &quot;html&quot;,
                    type: &quot;GET&quot;,
                    ajaxStart: function () {
                        currentAjaxOp = &quot;GetHeader&quot;;
                    },
                    success: function (data, textStatus, jqXHRData) {
                        // Load the header HTML...
                        $(&quot;#headFrame&quot;).html(data);
                        currentAjaxOp = &quot;&quot;;
                        $(&quot;#AppTitle&quot;).text(&quot;Victim Assistance Case Manager&quot;);
                        $(&quot;#AppSubTitle&quot;).text(&quot;&quot;);
                        $(&quot;#AppLogoPath&quot;).attr(&quot;src&quot;, &quot;/AppModernizationCDN/images/denverlogo.png&quot;);
                        $(&quot;#HeaderContactLink&quot;).attr(&quot;href&quot;, &quot;/VictimAssistanceUnit/Home/Contact&quot;);
                       
                        
                                  $(&quot;#LogInOutLink&quot;).text(&quot;Welcome Cameron Cox &quot;);
                                  $(&quot;#LogInOutLink&quot;).removeAttr(&quot;href&quot;);

                    },
                    error: function (jqXHRData, textStatus, errorThrown) {
                        // Load the alternate header here...
                        resourceRetrievalFailure = true;
                    }
                });
                $('#LogInOutLink').text() == 'Login' ? $('#LogInOutLink').hide() : $('#LogInOutLink').show();

                // Footer
                $.ajax({
                    url: &quot;/AppModernizationCDN/Resource/SafetyFooter&quot;,
                    dataType: &quot;html&quot;,
                    type: &quot;GET&quot;,
                    ajaxStart: function () {
                        currentAjaxOp = &quot;GetFooter&quot;;
                    },
                    success: function (data, textStatus, jqXHRData) {
                        // Load the header HTML...
                        // fixing incorrect data load from cdn
                        var currentYear = new Date().getFullYear();
                        data = &quot;&lt;footer> Copyright &amp;#169; &quot; + currentYear + &quot; City and County of Denver &lt;span class=\&quot;pull-right\&quot;>Version: &quot;+ appVersion +&quot;&lt;/span>&lt;/footer>&quot;;
                        $(&quot;#footFrame&quot;).html(data);
                        currentAjaxOp = &quot;&quot;;
                        //$(&quot;#version&quot;).html('Version: ' + appVersion);
                    },
                    error: function (jqXHRData, textStatus, errorThrown) {
                        // Load the alternate header here...
                        resourceRetrievalFailure = true;
                    }
                });

                // If there was an error let the user know so they don't think the layout is just bad!
                if (resourceRetrievalFailure) {
                    alert(&quot;A problem occurred while attempting to load page resources.  Please try loading the page again or contact support for assistance.&quot;);
                }
            }

        
        
    
/html[@class=&quot;-webkit-&quot;]/body[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;-webkit-&quot;]/body[1]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
