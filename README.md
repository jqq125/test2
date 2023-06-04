# test2
测试从本地上传代码
注意事项:

1.修改远程仓库的主分支名字为:master (在项目的settings)中

2.将代码推送至远程仓库时可能会出现问题，需要执行如下操作：
```txt

# 先拉取，--rebase表示如果没有冲突，直接合并，如果有手动解决，不会出现Merge branch 'master' of ...这种信息
1.git pull --rebase origin master  
# 再上传
2.git push -u origin master    
