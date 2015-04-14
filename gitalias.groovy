#!/usr/bin/env groovy

'git config --local alias.move checkout'.execute()
['git', 'config', '--local', 'alias.unstash', 'stash pop'].execute()
['git', 'config', '--local', 'alias.tree', 'log --graph --oneline --decorate'].execute()