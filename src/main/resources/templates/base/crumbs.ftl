<header class="panel-heading">
 ${firstMenuName}
 [#--判断当前菜单的等级--]
 [#if curryPageGrade==1]
		   [#--判断当前菜单是否为增加或者修改菜单--]
			   [#if isAddOrUpdatePage==1]
					   [#list curryLoginAdminMenu as menu1]
						    [#if menu1.url=currRequestRul]
						     \${menu1.name}
						    [#break]
						    [/#if]
					   [/#list]
			   [/#if]
   [#elseif curryPageGrade==2]
   			[#if isAddOrUpdatePage==1]
	   			   [#list curryLoginAdminMenu as menu1]
				    [#if menu1.url=currRequestRul]
				      [#list curryLoginAdminMenu as menu2]
				       	[#if menu1.relationmenu==menu2.id && menu2.grade==2 && menu2.autoattach==0]
				        	\<a href="${menu2.url}">${menu2.name}</a>\${menu1.name}
				       	[#break]
				       	[/#if]
				      [/#list]
				    [#break]
				    [/#if]
				   [/#list]
		     [#else]
				   [#list curryLoginAdminMenu as menu1]
					    [#if menu1.url=currRequestRul]
					     \${menu1.name}
					    [#break]
					    [/#if]
				   [/#list]
   			[/#if]
    [#elseif curryPageGrade==3]
       [#if isAddOrUpdatePage==1]
         [#list curryLoginAdminMenu as menu3]
            	[#if menu3.url==currRequestRul]
            	  [#list curryLoginAdminMenu as menu2]
            	      [#if menu3.relationmenu==menu2.id && menu2.grade==3 && menu2.autoattach==0 ]
	            	      	[#list curryLoginAdminMenu as menu1]
	            	      		[#if menu2.superior==menu1.id && menu1.grade==2&&menu1.autoattach==0]
	            	      		  \${menu1.name}\<a href="${menu2.url}">${menu2.name}</a>\${menu3.name}
	            	      		[#break]
	            	      		[/#if]
	            	      	[/#list]
            	      	[#break]
            	      [/#if]
            	  [/#list]
            	[#break]
            	[/#if]
	         [/#list]
         [#else]
         	[#list curryLoginAdminMenu as menu3]
	            [#if menu3.url==currRequestRul]
	            	[#list curryLoginAdminMenu as menu2]
	            	  [#if menu3.superior==menu2.id && menu2.grade==2 && menu2.autoattach==0 ]
	            	  [#--获取二级菜单下的一个三级菜单--]
	            	  [#list curryLoginAdminMenu as menu5]
	            	    [#if menu5.superior==menu2.id && menu5.grade==3&& menu5.autoattach==0]
	            	     \<a href="${menu5.url}">${menu2.name}</a>\${menu3.name}
	            	    [#break]
	            	  	[/#if]
	            	  [/#list ]
	            	  [#break]
	            	  [/#if]
	            	[/#list]
	            [#break]
	            [/#if]
         	[/#list]
       [/#if]
 [/#if]            
  </header>